package com.test.test.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@Data
@Entity(name = "titleBasic")
@Table(name = "TITLE_BASIC")
public class TitleBasic implements Serializable {
    @javax.persistence.Id
    @Id
    @Column
    String id;

    @Column
    private String type;

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
