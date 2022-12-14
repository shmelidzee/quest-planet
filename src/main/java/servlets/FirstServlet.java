package servlets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

@WebServlet(name = "FirstServlet", value = "/start")
public class FirstServlet extends HttpServlet {
    private static Logger LOGGER = LogManager.getLogger(FirstServlet.class);
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info(String.format("Do post req:%s", req));
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        User user = null;
        String name = req.getParameter("userName");
        if (Users.listUsers.size() != 0) {
            for (int i = 0; i < Users.listUsers.size(); i++) {
                if (name.equals(Users.listUsers.get(i).getName())) {
                    user = Users.listUsers.get(i);
                    LOGGER.info(String.format("get user:%s", user.getName()));
                }
            }
        } else {
            user = new User(name, session.getId(), session.getCreationTime());
            LOGGER.info(String.format("Create user %s", req));
        }
        session.setAttribute("user", user);
        DialogServlet dialogServlet = new DialogServlet();
        dialogServlet.doGet(req, resp);
    }
}
