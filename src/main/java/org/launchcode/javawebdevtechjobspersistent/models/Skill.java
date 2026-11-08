package org.launchcode.javawebdevtechjobspersistent.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<Job>();

    // no arg constructor for hibernate
    public Skill() {}

    private String description;

    // getter
    public String getDescription() {
        return description;
    }

    // setter
    public void setDescription(String description) {
        this.description = description;
    }

}