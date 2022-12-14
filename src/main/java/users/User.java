package users;

import java.sql.Date;

public class User {
    private String name;
    private String id;
    private int loss = 0;
    private int win = 0;
    private Date dateSignUp;

    public User(String name, String id, long dateSignUp) {
        this.name = name;
        this.id = id;
        this.dateSignUp = new Date(dateSignUp);

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
    }

    public int getWin() {
        return win;
    }

    public void setWin() {
        this.win++;
    }

    public Date getDateSignUp() {
        return dateSignUp;
    }
}


