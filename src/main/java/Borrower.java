import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {this.collection = new ArrayList<Book>();}

    public void add(Book book) {this.collection.add(book);}

    public void getBookFromLibrary (Library library) {
        Book book = library.removeBook();
        this.collection.add(book);

    }

    public int bookCount() {
        return this.collection.size();
    }
}
