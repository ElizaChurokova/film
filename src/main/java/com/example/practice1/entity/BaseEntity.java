package com.example.practice1.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;


@MappedSuperclass
public abstract class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
    private Long id;

  public BaseEntity(){

  }
  public Long getId(){
      return id;
  }
  public BaseEntity setId(Long id){
      this.id = id;
      return this;
  }

}
