package patterns2.patterns2.bookclassifier;

import org.junit.Assert;
import org.junit.Test;
import patterns2.patterns2.adapter.bookclasifier.MedianAdapter;
import patterns2.patterns2.adapter.bookclasifier.librarya.Book;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Stanisław Lem","Solaris",1961,"172635243456724364");
        Book book2 = new Book("Stanisław Lem","Cyberiada",1965,"122635243456726587");
        Book book3 = new Book("Stanisław Lem","Niezwyciężony",1964,"192635249645324364");
        Book book4 = new Book("Stanisław Lem","Powrót z gwiazd",1961,"132689623456724398");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int mediana = medianAdapter.publicationYearMediana(bookSet);
        //Then
        Assert.assertEquals(1964,mediana);
    }
}
