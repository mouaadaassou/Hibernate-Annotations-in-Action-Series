package io.nodom.bookdomain.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_contact_point")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class ContactPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "t_available_languages", joinColumns = @JoinColumn(name = "t_contact_point_id"))
    @Enumerated(EnumType.STRING)
    private Set<Language> languages;

    @Column(name = "email")
    @NaturalId
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "fax")
    private String fax;

    @Column(name = "hours_available")
    private String hoursAvailable;

    @OneToOne(mappedBy = "contactPoint")
    private Publisher publisher;

    @Override
    public int hashCode() {
        return this.email.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        } else if (object instanceof ContactPoint) {
            ContactPoint contactPoint = (ContactPoint) object;
            return this.email.equals(contactPoint.email);
        }
        return false;
    }
}
