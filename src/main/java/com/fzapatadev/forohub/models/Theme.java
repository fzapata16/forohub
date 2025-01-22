package com.fzapatadev.forohub.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Theme implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String mesage;
    private LocalDateTime creationDate;
    private String status;
    private String author;
    private String course;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {

        return id;
    }
}
