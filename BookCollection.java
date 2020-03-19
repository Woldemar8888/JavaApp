package classes.library;

import java.util.ArrayList;
import java.util.List;


public class BookCollection {
    List<Book> bookMap = new ArrayList<Book>();

    public List<Book> getBookMap() {
        return bookMap;
    }
    public void setBookMap(List<Book> bookMap) {
        this.bookMap = bookMap;
    }
    public void addBook(Book book){
        bookMap.add(book);
    }

    public void bookList( String author){
        for ( Book book :  bookMap){
            for(String a : book.getAuthors()){
                if ( author.equals(a)){
                    System.out.println(book);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\nBookCollection{" +
                "bookMap=" + bookMap +
                '}';
    }
}
