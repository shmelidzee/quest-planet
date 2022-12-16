package servlets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LastServlet", value = "/last")
public class LastServlet extends HttpServlet {
    private static Logger LOGGER = LogManager.getLogger(LastServlet.class);
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long answerButton = Integer.parseInt(req.getParameter("button-choose"));
        LOGGER.info("Get answerButton");
        if (answerButton == 1){
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
