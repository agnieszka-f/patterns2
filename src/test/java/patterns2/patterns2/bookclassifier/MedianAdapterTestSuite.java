package patterns2.patterns2.bookclassifier;

import org.junit.Assert;
import org.junit.Test;
import patterns2.patterns2.adapter.bookclasifier.MedianAdapter;
import patterns2.patterns2.adapter.bookclasifier.librarya.BookA;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        BookA bookA1 = new BookA("Stanisław Lem","Solaris",1961,"172635243456724364");
        BookA bookA2 = new BookA("Stanisław Lem","Cyberiada",1965,"122635243456726587");
        BookA bookA3 = new BookA("Stanisław Lem","Niezwyciężony",1964,"192635249645324364");
        BookA bookA4 = new BookA("Stanisław Lem","Powrót z gwiazd",1961,"132689623456724398");
        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(bookA1);
        bookASet.add(bookA2);
        bookASet.add(bookA3);
        bookASet.add(bookA4);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int mediana = medianAdapter.publicationYearMediana(bookASet);
        //Then
        Assert.assertEquals(1964,mediana);
    }
}
