package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

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