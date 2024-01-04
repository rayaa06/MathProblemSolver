package bg.smg;

public class Player {
    private String username;
    private String password;
    private int score;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", score=" + score +
                '}';
    }

    public Player(String username, String password, int score) {
        this.username = username;
        this.password = password;
        this.score = score;
    }
    public Player() {
        this.username = null;
        this.password = null;
        this.score = 0;
    }
}
