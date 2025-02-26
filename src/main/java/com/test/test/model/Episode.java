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

@Entity(name = "episode")
@Table(name = "EPISODE")
public class Episode implements Serializable {

    @javax.persistence.Id
    @Id
    @Column
    String id;

    @Column
    private String parentConst;

    @Column
    Integer seasonNumber;

    @Column
    Integer episodeNumber;
}
