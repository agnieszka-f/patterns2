package patterns2.patterns2.adapter.bookclasifier;

import patterns2.patterns2.adapter.bookclasifier.librarya.BookA;

import patterns2.patterns2.adapter.bookclasifier.librarya.Classifier;
import patterns2.patterns2.adapter.bookclasifier.libraryb.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianaAdaptee implements Classifier {

    @Override
    public int publicationYearMediana(Set<BookA> bookASet) {
       Map<BookSignature, BookB> bookMap = new HashMap<>();
            for(BookA bookA : bookASet){
                BookB bookB = new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
                BookSignature bookSignature = new BookSignature(bookA.getSignature());
                bookMap.put(bookSignature, bookB );
            }
       return medianaPublicationYear(bookMap);
    }
}
