package com.test.test.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Getter
@Setter

@Entity(name = "rate")
@Table(name = "RATE")
public class Rate implements Serializable {

    @javax.persistence.Id
//    @Id
    @Column
    String ID;

    @Column
    private Double averageRating;

    @Column
    Integer numVotes;
}
