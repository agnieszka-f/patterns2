package patterns2.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class HomeworkTestSuite {
    @Test
    public void test1(){
        //Given
        Mentor mentor1 = new Mentor("Sławomir");
        Mentor mentor2 = new Mentor("Teodor");

        HomeworkQueue alojzyBabel = new HomeworkQueue("Alojzy Bąbel");
        HomeworkQueue kajetanMruczek = new HomeworkQueue("Kajetan Mruczek");
        HomeworkQueue michalinaEwart = new HomeworkQueue("Michalina Ewart");

        alojzyBabel.addObserver(mentor1);
        kajetanMruczek.addObserver(mentor1);
        michalinaEwart.addObserver(mentor2);

        //When
        alojzyBabel.addHomework(new Homework("Zadanie nr 1", new Date(2020,10,01,8,30), "Treść zadania nr 1....."));
        alojzyBabel.addHomework(new Homework("Zadanie nr 2", new Date(2020,10,02,9,30), "Treść zadania nr 2....."));
        kajetanMruczek.addHomework(new Homework("Zadanie nr 1", new Date(2020,10,02,16,30), "Treść zadania nr 1....."));
        michalinaEwart.addHomework(new Homework("Zadanie nr 1", new Date(2020,10,03,9,30), "Treść zadania nr 1....."));
        //Then
        Assert.assertEquals(3, mentor1.getNumberOfHomework());
        Assert.assertEquals(1, mentor2.getNumberOfHomework());
    }
}
