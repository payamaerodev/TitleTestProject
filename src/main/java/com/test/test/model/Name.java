package com.test.test.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@Data
@Table(name = "NAME")

@NamedQuery(name = "NameBasic.findLiveWriters",
        query = "FROM name n where n.deathYear = 0 and n.directors.size!=0")

@Entity(name = "name")
public class Name implements Serializable {
    @javax.persistence.Id
    @Column
    String id;

    @Column
    private String primaryName;

    @Column
    private Integer birthYear;

    @Column
    private Integer deathYear;

    @OneToMany(mappedBy = "relatedDirectors")
    public List<Crew> directors;


    @Column
    private String primaryProfession;

    @Column
    private String knownForTitles;
}
