package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by holdenhughes on 11/10/15.
 */
@Entity //creates table
public class Beer {
    @Id //id
    @GeneratedValue
    @Column(nullable =false)
    int id;
    @Column(nullable =false)
    public String name;
    @Column(nullable =false)
    public String type;
    @Column(nullable =false)
    public Integer calories;

    @ManyToOne
    public User user;

}
