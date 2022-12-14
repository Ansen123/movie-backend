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
    private int releasedYear;
    private String language;

    public MovieModel(int id, String movieName, int releasedYear, String language) {
        this.id = id;
        this.movieName = movieName;
        this.releasedYear = releasedYear;
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

    public int getReleasedYear() {
        return releasedYear;
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

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}