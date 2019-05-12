package io.nodom.bookdomain.dto;



import java.io.Serializable;

public class AuthorDTO implements Serializable {

    public AuthorDTO(String ORCID, String firstName, String lastName, AddressDTO address, String email, String gender, String jobTitle, String telephone) {
        this.ORCID = ORCID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.telephone = telephone;
    }

    public AuthorDTO() {
    }

    private String ORCID;
    private String firstName;
    private String lastName;
    private AddressDTO address;
    private String email;
    private String gender;
    private String jobTitle;
    private String telephone;

    public String getORCID() {
        return ORCID;
    }

    public void setORCID(String ORCID) {
        this.ORCID = ORCID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressDTO getAddressDTO() {
        return address;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.address = addressDTO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
