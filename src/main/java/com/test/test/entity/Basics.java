package com.test.test.entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "basics")
public class Basics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;


}