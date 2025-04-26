package com.example.accessing_data_rest.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

@Entity
@JsonIdentityInfo(
        scope=User.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "uid")
@Table(name="user_table") // this is important! "user" is a keyword in H2 and not an identifier
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;

    private String name;

    // TODO this class needs to be extended with references to Player and
    //      the other way round (similar to the reference from Game to Player
    //      and the other way round.

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
