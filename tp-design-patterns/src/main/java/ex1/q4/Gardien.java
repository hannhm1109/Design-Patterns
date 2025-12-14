package ex1.q4;

/**
 * @author hanane
 **/
public class Gardien implements Observer {
    @Override
    public void update(int score) {
        System.out.println("Gardien notified. Score = " + score);
    }
}
