package ex1.q4;

/**
 * @author hanane
 **/
public class Camera implements Observer {
    @Override
    public void update(int score) {
        System.out.println("Camera notified. Score = " + score);
    }
}
