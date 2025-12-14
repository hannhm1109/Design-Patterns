package ex1.q4;

/**
 * @author hanane
 **/
public class Couloir implements Observer {
    @Override
    public void update(int score) {
        System.out.println("Couloir notified. Score = " + score);
    }
}
