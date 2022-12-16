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

@WebServlet(name = "LossServlet", value = "/loss")
public class LossServlet extends HttpServlet {
    private static Logger LOGGER = LogManager.getLogger(LossServlet.class);
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        user.setLoss();
        QuestionRepository.sentences.remove("loss");
        req.setAttribute("list", QuestionRepository.sentences);
        session.removeAttribute("userLoss");
        session.setAttribute("userLoss", user.getLoss());
        LOGGER.info("Forward with loss");
        req.getRequestDispatcher("/loss.jsp").forward(req, resp);
    }
}
