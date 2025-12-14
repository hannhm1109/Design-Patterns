package ex1.q4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanane
 **/
public class Joueur implements Subject {
    private int score;
    private List<Observer> observers = new ArrayList<>();

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(score);
        }
    }
}
