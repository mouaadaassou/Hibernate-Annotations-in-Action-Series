package io.nodom.bookdomain.domain;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.nodom.bookdomain.serializer.CustomAuthorSetSerializer;
import io.nodom.bookdomain.serializer.CustomPublisherSetSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "t_book")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Book.class)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NaturalId
    @Column(name = "isbn")
    private String ISBN;

    @Column(name = "title")
    private String title;

    @ElementCollection
    @JoinTable(name = "t_book_format", joinColumns = @JoinColumn(name = "t_book_id"))
    @Enumerated(value = EnumType.STRING)
    private Set<BookFormat> bookFormats;

    @Column(name = "number_of_pages")
    private Integer numberOfPages;

    @Column(name = "number_of_copies_sold")
    private Integer numberOfCopiesSold;

    @Column(name = "date_of_publication")
    private LocalDate dateOfPublish;

    @ManyToMany
    @JoinTable(name = "t_book_author", joinColumns = @JoinColumn(name = "t_book_id"),
            inverseJoinColumns = @JoinColumn(name = "t_author_id"))
    @JsonSerialize(using = CustomAuthorSetSerializer.class)
    private Set<Author> authors;

    @ManyToMany
    @JoinTable(name = "t_book_publisher", joinColumns = @JoinColumn(name = "t_book_id"),
            inverseJoinColumns = @JoinColumn(name = "t_publisher_id"))
    @JsonSerialize(using = CustomPublisherSetSerializer.class)
    private Set<Publisher> publishers;

    @Override
    public int hashCode() {
        return this.ISBN.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        } else if (object instanceof Book) {
            Book book = (Book) object;
            return this.ISBN.equals(book.ISBN);
        }
        return false;
    }

}
