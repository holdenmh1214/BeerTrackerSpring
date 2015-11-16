package com.theironyard.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by holdenhughes on 11/10/15.
 */
@Entity //creates table
public class Beer {
    @Id //id
    @GeneratedValue //increments
    Integer id;

    public String name;
    public String type;
    public Integer calories;

    @ManyToOne
    public User user;

}
