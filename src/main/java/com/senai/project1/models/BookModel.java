package com.senai.project1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class BookModel {

    @Id
    private Integer bok_id;
    private String bok_title;
    private String bok_author;
    private int bok_isbn;
    private LocalDateTime bok_pub_date;

    public int getBok_id() {
        return bok_id;
    }

    public void setBok_id(int bok_id) {
        this.bok_id = bok_id;
    }

    public String getBok_title() {
        return bok_title;
    }

    public void setBok_title(String bok_title) {
        this.bok_title = bok_title;
    }

    public String getBok_author() {
        return bok_author;
    }

    public void setBok_author(String bok_author) {
        this.bok_author = bok_author;
    }

    public int getBok_isbn() {
        return bok_isbn;
    }

    public void setBok_isbn(int bok_isbn) {
        this.bok_isbn = bok_isbn;
    }

    public LocalDateTime getBok_pub_date() {
        return bok_pub_date;
    }

    public void setBok_pub_date(LocalDateTime bok_pub_date) {
        this.bok_pub_date = bok_pub_date;
    }
}
