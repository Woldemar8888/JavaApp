package classes.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        for (int i = 0; i < 10; i++) {
            List<String> stringList = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                stringList.add("Author " + (int) (Math.random() * 10));
            }
            Book book = new Book(i, "Book " + i, stringList, LocalDate.now().minusYears((int) (Math.random() * 10)));
            bookCollection.addBook(book);
        }
        System.out.println(bookCollection);
        bookCollection.bookList("Author 1");
    }
}
