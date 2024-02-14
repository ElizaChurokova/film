package com.example.practice1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "film")

public class Film extends BaseEntity{
    @Column(name = "name", unique = true)
    private String name;
    @Column(name = "genre")
    private String genre;
    @Column(name = "year_of_issue")
    private Integer yearOfIssue;
    @Column(name = "language")
    private String language;
}
