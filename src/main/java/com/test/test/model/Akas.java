package com.test.test.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Data

@Entity(name = "akas")
@Table(name = "AKAS")
public class Akas implements Serializable {
    @javax.persistence.Id
    @Id
    @Column
    String id;

    @Column
    Integer ordering;

    @Column
    private String title;

    @Column
    String region;

    @Column
    String language;

    @Column
    String types;

    @Column
    String attributes;

    @Column
    Integer isOriginalTitle;
}
