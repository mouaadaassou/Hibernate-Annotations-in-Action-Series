package io.nodom.bookdomain.dto;

import io.nodom.bookdomain.domain.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


public class ContactPointDTO implements Serializable {

    public ContactPointDTO() {
    }

    public ContactPointDTO(Set<Language> languages, String email, String telephone, String fax, String hoursAvailable) {
        this.languages = languages;
        this.email = email;
        this.telephone = telephone;
        this.fax = fax;
        this.hoursAvailable = hoursAvailable;
    }

    private Set<Language> languages;
    private String email;
    private String telephone;
    private String fax;
    private String hoursAvailable;

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHoursAvailable() {
        return hoursAvailable;
    }

    public void setHoursAvailable(String hoursAvailable) {
        this.hoursAvailable = hoursAvailable;
    }
}
