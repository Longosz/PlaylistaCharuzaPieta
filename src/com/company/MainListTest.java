package com.company;

import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static org.junit.Assert.*;



public class MainListTest extends junit.framework.TestCase {
    MainList Mainlist1;
    Playlist Playlist1;

    public MainListTest() {
    }

    protected void setUp() throws Exception {



    }

    @org.junit.Test
    public void testAddPlaylist() throws Exception {
        Artist art2;
        art2 = new Artist("TOMB", "Rap", "Poland");
        Artist art3;
        art3 = new Artist("Sylena Johnson", "R&B", "USA");
        Song song1;
        song1 = new Song("Laboraptorium", art2, 3, 11);
        Song song2;
        song2 = new Song("Alibumaye", art2, 4, 6);
        ArrayList<Song> List1;
        List1 = new ArrayList<Song>();
        List1.add(song1);
        List1.add(song2);
        Playlist1.setSongList(List1);
        Mainlist1.addPlaylist(Playlist1);
        assertTrue(Mainlist1.getPlaylist("Untitled") == Playlist1);

    }

    @org.junit.Test
    public void testRemovePlaylist() throws Exception {
        Artist art2;
        art2 = new Artist("TOMB", "Rap", "Poland");
        Artist art3;
        art3 = new Artist("Sylena Johnson", "R&B", "USA");
        Song song1;
        song1 = new Song("Laboraptorium", art2, 3, 11);
        Song song2;
        song2 = new Song("Alibumaye", art2, 4, 6);
        ArrayList<Song> List1;
        List1 = new ArrayList<Song>();
        List1.add(song1);
        List1.add(song2);
        Playlist1.setSongList(List1);
        Mainlist1.addPlaylist(Playlist1);
        Mainlist1.removePlaylist(Playlist1);
        assertTrue(Mainlist1.getPlaylist("Untitled") == null);


    }


}