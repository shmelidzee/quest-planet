package servlets;

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
        req.getRequestDispatcher("/loss.jsp").forward(req, resp);
    }
}
