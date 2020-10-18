package patterns2.patterns2.observer.homework;

public interface Observable {
    public void notifyObservers();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
}
