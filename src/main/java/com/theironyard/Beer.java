package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;

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

    String name;
    String type;
    Integer calories;

    @ManyToOne
    User user;

}
