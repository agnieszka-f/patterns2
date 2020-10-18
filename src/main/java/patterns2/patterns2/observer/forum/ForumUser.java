package patterns2.patterns2.observer.forum;

public class ForumUser implements Observer{
    private final String username;
    private int updateCount;

    public ForumUser(String name) {
        this.username = name;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + ": New message in topic " + forumTopic.getName() + "\n" +
                                "(total: " + forumTopic.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
