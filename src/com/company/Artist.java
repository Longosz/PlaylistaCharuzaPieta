package com.company;
        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.Scanner;
/**
 * Created by student14 on 2014-11-27.
 */
public class Artist {
    private String name;
    private String genre;
    private String country;

    public Artist(String name, String genre, String country) {
        this.name = name;
        this.genre = genre;
        this.country = country;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }





}