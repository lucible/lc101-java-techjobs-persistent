package org.launchcode.javawebdevtechjobspersistent.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "employer")
    private List<Job> jobs = new ArrayList<Job>();

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
