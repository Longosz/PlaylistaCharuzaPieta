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
public class Song {
    private Artist artist;
    private String title;
    private int minutes;
    private int seconds;

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Song(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public Song(String title, Artist artist, int minutes, int seconds) {
        this.title = title;
        this.artist = artist;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Song(Song s) {
        this.title = s.title;
        this.artist = s.artist;
        this.minutes = s.minutes;
        this.seconds = s.seconds;

    }
}

