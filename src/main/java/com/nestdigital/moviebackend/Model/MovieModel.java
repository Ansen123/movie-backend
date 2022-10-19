package com.nestdigital.moviebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="movies")
public class MovieModel {
    @Id
    @GeneratedValue
    private int id;
    private String movieName;
    private int releasdYear;
    private String language;

    public MovieModel(int id, String movieName, int releasdYear, String language) {
        this.id = id;
        this.movieName = movieName;
        this.releasdYear = releasdYear;
        this.language = language;
    }

    public MovieModel() {
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getReleasdYear() {
        return releasdYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleasdYear(int releasdYear) {
        this.releasdYear = releasdYear;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
