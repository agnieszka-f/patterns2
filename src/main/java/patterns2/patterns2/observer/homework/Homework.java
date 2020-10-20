package patterns2.patterns2.observer.homework;

import java.util.Date;

public class Homework {
    private String subject;
    private Date creationDate;
    private String content;

    public Homework(String subject, Date creationDate, String content) {
        this.subject = subject;
        this.creationDate = creationDate;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getContent() {
        return content;
    }
}
