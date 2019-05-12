package io.nodom.bookdomain.domain;


import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "t_publisher")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NaturalId
    @Column(name = "tax_id")
    private String taxId;

    @ElementCollection
    @JoinTable(name = "awards", joinColumns = @JoinColumn(name = ""))
    private List<String> awards;

    @Column(name = "website")
    private String webSite;

    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "publishers")
    private Set<Book> books;

    @OneToOne
    private ContactPoint contactPoint;

    @OneToOne
    private Address address;

    @Override
    public int hashCode() {
        return this.taxId.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof  Publisher) {
            Publisher publisher = (Publisher)object;
            return this.taxId.equals(publisher.taxId);
        }
        return false;
    }


}
