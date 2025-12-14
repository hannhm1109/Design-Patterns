package ex1.q4;

/**
 * @author hanane
 **/
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
