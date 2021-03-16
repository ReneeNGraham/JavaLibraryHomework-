import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void setUp() {
        library = new Library(200);
        book = new Book("Pride and Prejudice","Jane Austen", "Period");
        book1 = new Book("East of Eden","John Steinbeck", "Fiction");
        book2 = new Book("Dance, Dance, Dance","Haruki Murakami", "Fiction");
        book3 = new Book("Things Fall Apart","Chinua Achebe", "Fiction");
        book4 = new Book("Dreams of My Father","Barack Obama", "Non Fiction");
        book5 = new Book("The Long Dark Tea-Time of the Soul","Douglas Adams", "Parody");
    }

    @Test
    public void bookCountStartsAtZero() {
        assertEquals (0, library.bookCount());

    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount() );
    }

    @Test
    public void canRemoveBookFromLibrary() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());

    }





}
