package patterns2.patterns2.adapter.bookclasifier;

import patterns2.patterns2.adapter.bookclasifier.libraryb.Book;
import patterns2.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import patterns2.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import patterns2.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianaAdaptee implements BookStatistics {
    private Statistics statistics;

    public MedianaAdaptee() {
        this.statistics =new Statistics();
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {

        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianaPublicationYear(Map<BookSignature, Book> books) {

        return statistics.medianaPublicationYear(books);
    }
}
