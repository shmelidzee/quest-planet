package users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import servlets.DialogServlet;

import java.sql.Date;

public class User {
    private static Logger LOGGER = LogManager.getLogger(User.class);
    private String name;
    private String id;
    private int loss = 0;
    private int win = 0;
    private Date dateSignUp;

    public User(String name, String id, long dateSignUp) {
        this.name = name;
        this.id = id;
        this.dateSignUp = new Date(dateSignUp);
        LOGGER.info(String.format("Success create user name:%s, id:%s, date:%s", name, id, dateSignUp));
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss() {
        this.loss++;
        LOGGER.info(String.format("set loss for %s", name));
    }

    public int getWin() {
        return win;
    }

    public void setWin() {
        this.win++;
        LOGGER.info(String.format("set win for %s", name));
    }

    public Date getDateSignUp() {
        return dateSignUp;
    }
}


