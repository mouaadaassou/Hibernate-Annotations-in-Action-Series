package io.nodom.bookdomain.domain;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "t_author")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Author.class)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "orcid")
    @NaturalId
    private String ORCID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne
    private Address address;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "email")
    @Pattern(regexp = "^[a-zA-Z0-9]+@gmail\\.[a-z]+")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "telephone")
    @Pattern(regexp = "[0-9]{14}")
    private String telephone;

    @Override
    public int hashCode() {
        return this.ORCID.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        } else if (object instanceof Author) {
            Author author = (Author) object;
            return this.ORCID.equals(author.ORCID);
        }
        return false;
    }
}
