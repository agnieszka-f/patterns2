package patterns2.patterns2.observer.forum;


import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser alojzyBabel = new ForumUser("Alojzy Bąbel");

        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(alojzyBabel);
        //When
        javaHelpForum.addPost("Post nr 1");
        javaToolsForum.addPost("Post nr 2");
        //Then
        Assert.assertEquals(2, johnSmith.getUpdateCount());
        Assert.assertEquals(1, alojzyBabel.getUpdateCount());
    }
}
