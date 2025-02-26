package com.test.test.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Getter
@Setter

@Entity(name = "crew")
@Table(name = "CREW")
public class Crew implements Serializable {

    @javax.persistence.Id
    @Id
    @Column
    String id;

    @Column
    private String directors;

    @ManyToOne
    @JoinColumn(name="directors", insertable=false, updatable=false)
    Name relatedDirectors;

    @Column()
    String writers;
}
