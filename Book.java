package classes.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String name;
    private List<String> authors = new ArrayList<String>();
    private LocalDate localDate;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", localDate=" + localDate.getYear() +
                '}'+'\n';
    }

    public Book(int id, String name, List<String> authors, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
