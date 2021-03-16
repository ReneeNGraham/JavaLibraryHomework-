import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void setUp() {
        borrower = new Borrower();
        library = new Library(200);
        book = new Book("Ted Talk Storytelling", "Susan Friedman", "Non - Fiction");
    }

    @Test
    public void canAddBookToBorrower() {
        borrower.add(book);
        assertEquals(1, borrower.bookCount());

    }

}


