package patterns2.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable{
    private final String studentName;
    private final List<Homework> homeworks;
    private final List<Observer> observers;

    public HomeworkQueue(String studentName) {
        this.studentName = studentName;
        this.observers = new ArrayList<>();
        this.homeworks = new ArrayList<>();
    }
    public void addHomework(Homework homework){
        homeworks.add(homework);
        notifyObservers();
    }

    public List<Homework> getHomeworkList() {
        return homeworks;
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update(this);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getStudentName() {
        return studentName;
    }
}
