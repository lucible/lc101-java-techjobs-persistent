package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    // no arg constructor for hibernate
    public Employer() {}
    
    @NotBlank(message = "Location is required.")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters.")
    private String location;

    // getter
    public String getLocation() {
        return location;
    }

    // setter
    public void setLocation(String location) {
        this.location = location;
    }

}
