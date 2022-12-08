package servlets;


import users.User;
import repositories.Users;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;


@WebServlet(name = "FirstServlet", value = "/start")
public class FirstServlet extends HttpServlet {

    Logger log = LogManager.getLogManager().getLogger(String.valueOf(FirstServlet.class));
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        User user = null;
        String name = req.getParameter("userName");

        if (Users.listUsers.size() != 0) {
            for (int i = 0; i < Users.listUsers.size(); i++) {
                if (name.equals(Users.listUsers.get(i).getName())) {
                    user = Users.listUsers.get(i);
                }
            }
        }
        session.setAttribute("name", name);
        getServletContext().getRequestDispatcher("/dialog.jsp").forward(req, resp);
    }

}
