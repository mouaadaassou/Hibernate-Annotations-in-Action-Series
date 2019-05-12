package io.nodom.bookdomain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


public class AddressDTO implements Serializable {

    public AddressDTO(String country, String city, String region, String postOfficeBoxNumber, String postalCode, String streetAddress) {
        this.country = country;
        this.city = city;
        this.region = region;
        this.postOfficeBoxNumber = postOfficeBoxNumber;
        this.postalCode = postalCode;
        this.streetAddress = streetAddress;
    }

    public AddressDTO() {
    }



    private String country;
    private String city;
    private String region;
    private String postOfficeBoxNumber;
    private String postalCode;
    private String streetAddress;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    public void setPostOfficeBoxNumber(String postOfficeBoxNumber) {
        this.postOfficeBoxNumber = postOfficeBoxNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}
