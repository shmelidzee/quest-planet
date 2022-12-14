package servlets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import repositories.QuestionRepository;
import users.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "WinServlet", value = "/win")
public class WinServlet extends HttpServlet {
    private static Logger LOGGER = LogManager.getLogger(WinServlet.class);
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        user.setWin();
        QuestionRepository.sentences.remove("win");
        req.setAttribute("list", QuestionRepository.sentences);
        session.removeAttribute("userWin");
        session.setAttribute("userWin", user.getWin());
        LOGGER.info("Forward with win");
        req.getRequestDispatcher("/win.jsp").forward(req, resp);
    }
}
