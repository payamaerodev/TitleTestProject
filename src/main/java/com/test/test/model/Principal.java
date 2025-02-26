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
@Data
@Setter

@Entity(name = "principal")
@Table(name = "PRINCIPAL")
public class Principal implements Serializable {


    @javax.persistence.Id
    @Id
    @Column
    String id;

    @Column
    private Integer ordering;

    @Column
    String nconst;

    @Column
    String category;

    @Column
    String job;

    @Column
    String characters;
}
