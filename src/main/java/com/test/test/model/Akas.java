package com.test.test.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "akas")
@Table(name = "akas")
public class Akas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;
    @Column
    Integer ordering;

    @Column
    private String title;

    @Column
    Integer region;

    @Column
    Integer language;

    @Column
    Integer types;

    @Column
    Integer attributes;

    @Column
    Integer isOriginalTitle;
}
