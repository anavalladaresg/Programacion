import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public double getBookPrice(String name) {
        for (Book book : books) {
            if (book.name.equals(name)) {
                return book.price;
            }
        }
        return -1;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Name: " + book.name + ", Author: " + book.author + ", Price: " + book.price + ", Units: " + book.units);
        }
    }

    public void deleteBook() {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.units == 0) {
                iterator.remove();
            }
        }
    }

    public void updateBookPrice(String name, double newPrice) {
        for (Book book : books) {
            if (book.name.equals(name)) {
                book.price = newPrice;
                break;
            }
        }
    }
}
