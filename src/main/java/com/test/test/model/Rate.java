package com.test.test.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "rating")
@Table(name = "rating")
public class Rate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;

    @Column
    private Integer averageRating;

    @Column
    Integer numVotes;
}
