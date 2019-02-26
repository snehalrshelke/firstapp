package first.com.authorbook.model1;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
      @Id
        @GeneratedValue(strategy = GenerationType.AUTO)private String name;
        public long id;private String psvn;
    private String publisher;
    @ManyToMany
            @JoinTable(name="author_book",joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns = @JoinColumn(name = "author_id"))
    Set<Author>authors=new HashSet<>();

    public Book(String name, String psvn, String publisher) {
        this.name = name;
        this.psvn = psvn;
        this.publisher = publisher;
    }

    public Book(String name, String psvn, String publisher, Set<Author> authors) {
        this.name = name;
        this.psvn = psvn;
        this.publisher = publisher;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsvn() {
        return psvn;
    }

    public void setPsvn(String psvn) {
        this.psvn = psvn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
