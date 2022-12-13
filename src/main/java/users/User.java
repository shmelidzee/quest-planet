package users;

public class User {
    private String name;
    private String id;
    private int loss = 0;
    private int win = 0;
    private long dateSignUp;

    public User(String name, String id, long dateSignUp) {
        this.name = name;
        this.id = id;
        this.dateSignUp = dateSignUp;
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

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public long getDateSignUp() {
        return dateSignUp;
    }

    public void setDateSignUp(long dateSignUp) {
        this.dateSignUp = dateSignUp;
    }
}
