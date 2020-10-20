package patterns2.patterns2.adapter.bookclasifier;

import patterns2.patterns2.adapter.bookclasifier.librarya.Book;

import patterns2.patterns2.adapter.bookclasifier.librarya.Classifier;
import patterns2.patterns2.adapter.bookclasifier.libraryb.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianaAdaptee implements Classifier {

    @Override
    public int publicationYearMediana(Set<Book> bookSet) {
       Map<BookSignature, patterns2.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
            for(Book book : bookSet){
                bookMap.put(new BookSignature(book.getSignature()), new patterns2.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(),book.getTitle(),book.getPublicationYear()));
            }
       return medianaPublicationYear(bookMap);
    }
}
