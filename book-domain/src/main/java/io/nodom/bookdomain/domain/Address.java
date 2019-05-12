package io.nodom.bookdomain.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "t_address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country")
    @Size(max = 30, min = 4)
    private String country;

    @Column(name = "city")
    @Size(max = 30, min = 4)
    private String city;

    @Column(name = "region")
    @Size(max = 30, min = 3)
    private String region;

    @Column(name = "box_number")
    @Size(max = 30, min = 1)
    private String postOfficeBoxNumber;

    @Column(name = "postal_code")
    @Size(max = 10, min = 3)
    private String postalCode;

    @Column(name = "street")
    @Size(max = 50, min = 10)
    private String streetAddress;

    @OneToOne(mappedBy = "address")
    private Author author;

    @OneToOne(mappedBy = "address")
    private Publisher publisher;

    @Override
    public int hashCode() {
        return this.postalCode.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof Address) {
            Address address = (Address) object;
            return this.country.equals(address.country) &&
                    this.city.equals(address.city) &&
                    this.postalCode.equals(address.postalCode);
        }
        return false;
    }
}
