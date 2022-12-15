package repositories;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;

public class QuestionRepository {

    public static long winIdQuestion;
    public static long lossIdQuestion;
    public static long correctAnswer;
    public static String answer1;
    public static String answer2;
    public static String question;
    public static ArrayList<String> sentences;

    public static void getQuestion(long idQuestion, HttpServletRequest req, HttpServletResponse resp){
        clearValues();
        File config = null;
        URL resource = QuestionRepository.class.getClassLoader().getResource("question.json");
        try {
        config = new File(resource.toURI());
        }catch (Throwable throwable){
            System.out.println("exception");
        }
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader reader = new FileReader(config);
            Object obj = jsonParser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject questions = (JSONObject) jsonObject.get("questions");
            JSONObject inQuestion = (JSONObject) questions.get(String.valueOf(idQuestion));

            if (inQuestion.containsValue("win")) {
                parseSentences(inQuestion);
                req.getRequestDispatcher("/win").forward(req, resp);
                return;
            }
            if (inQuestion.containsValue("loss")) {
                parseSentences(inQuestion);
                req.getRequestDispatcher("/loss").forward(req, resp);
                return;
            }
            winIdQuestion = (Long) inQuestion.get("idWinQuestion");
            lossIdQuestion = (Long) inQuestion.get("idLossQuestion");
            answer1 = (String) inQuestion.get("answer1");
            answer2 = (String) inQuestion.get("answer2");
            correctAnswer = (Long) inQuestion.get("correctAnswer");
            question = (String) inQuestion.get("question");
            parseSentences(inQuestion);

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static void clearValues() {
        winIdQuestion = 0;
        lossIdQuestion = 0;
        correctAnswer = 0;
        answer1 = null;
        answer2 = null;
        question = null;
        sentences = new ArrayList<>();
    }

    private static void parseSentences(JSONObject inQuestion) {
        boolean exits = true;
        int count = 1;
        while (exits) {
            if (inQuestion.containsKey(String.format("sentence%s", count))) {
                sentences.add((String) inQuestion.get(String.format("sentence%s", count)));
                count++;
            } else {
                exits = false;
            }
        }
    }
}
