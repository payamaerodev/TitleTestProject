package com.test.test.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "product")
@Table(name = "product")
public class Basic implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;


    @Column
    private String type;
    @Column
    private String name;
    @Column
    private String primaryTitle;
    @Column

    private String originalTitle;
    @Column

    private String isAdult;
    @Column

    private String startYear;
    @Column

    private String endYear;
    @Column

    private String runtimeMinutes;
    @Column

    private String genres;


}
