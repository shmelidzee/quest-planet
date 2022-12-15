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

@WebServlet(name = "DialogServlet", value = "/dialog")
public class DialogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        QuestionRepository.getQuestion(1, req, resp);
        req.setAttribute("answer1", QuestionRepository.answer1);
        req.setAttribute("answer2", QuestionRepository.answer2);
        req.setAttribute("question", QuestionRepository.question);
        req.setAttribute("list", QuestionRepository.sentences);

        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        session.setAttribute("userId", user.getId());
        session.setAttribute("userName", user.getName());
        session.setAttribute("userLoss", user.getLoss());
        session.setAttribute("userWin", user.getWin());
        session.setAttribute("userSignUp", user.getDateSignUp());
        req.getRequestDispatcher("/dialog.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long nextIdQuestion = 0;
        long answerButton = Integer.parseInt(req.getParameter("button-choose"));

        if (QuestionRepository.correctAnswer == answerButton){
            nextIdQuestion = QuestionRepository.winIdQuestion;
        }
        else {
            nextIdQuestion = QuestionRepository.lossIdQuestion;
        }
        QuestionRepository.getQuestion(nextIdQuestion, req, resp);
        req.setAttribute("answer1", QuestionRepository.answer1);
        req.setAttribute("answer2", QuestionRepository.answer2);
        req.setAttribute("question", QuestionRepository.question);
        req.setAttribute("list", QuestionRepository.sentences);
        req.getRequestDispatcher("/dialog.jsp").forward(req, resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
