package io.nodom.bookdomain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


public class PublisherDTO implements Serializable {

    public PublisherDTO() {
    }

    public PublisherDTO(String taxId, List<String> awards, String webSite, String email, ContactPointDTO contactPoint, AddressDTO address) {
        this.taxId = taxId;
        this.awards = awards;
        this.webSite = webSite;
        this.email = email;
        this.contactPoint = contactPoint;
        this.address = address;
    }

    private String taxId;
    private List<String> awards;
    private String webSite;
    private String email;
    private ContactPointDTO contactPoint;
    private AddressDTO address;

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public List<String> getAwards() {
        return awards;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContactPointDTO getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(ContactPointDTO contactPoint) {
        this.contactPoint = contactPoint;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
