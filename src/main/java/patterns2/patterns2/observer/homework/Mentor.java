package patterns2.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int numberOfHomework;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println("Nowe zadanie od kursanta: " + homeworkQueue.getStudentName());
        numberOfHomework++;
    }

    public int getNumberOfHomework() {
        return numberOfHomework;
    }
}
