package com.company;

import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static org.junit.Assert.*;



public class PlaylistTest extends junit.framework.TestCase {

    Playlist Playlist1;

    public PlaylistTest() {
    }

    protected void setUp() throws Exception {
        Artist art2;
        art2 = new Artist("TOMB", "Rap", "Poland");
        Artist art3;
        art3 = new Artist("Sylena Johnson", "R&B", "USA");
        Song song1;
        song1 = new Song("Laboraptorium", art2, 3, 11);
        Song song2;
        song2 = new Song("Alibumaye", art2, 4, 6);
        Song song3;
        song3 = new Song("Slowly", art3, 4, 38);
        ArrayList<Song> List1;
        /*/List1 = new ArrayList<Song>();
        List1.add(song1);
        List1.add(song2);
        Playlist1 = new Playlist()/*/
    }


    protected void tearDown() throws Exception {
    }


    @org.junit.Test
    public void testSetName() throws Exception {
        Playlist1.setName("Lista nr1");
        assertEquals(Playlist1.getName() == "Lista nr1");
    }


    @org.junit.Test
    public void testSetSongList() throws Exception {
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
        assertTrue(Playlist1.getSongList() == List1);


    }

    @org.junit.Test
    public void testClear() throws Exception {
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
        Playlist1.getSongList();
        assertTrue(Playlist1.clear() == true);

    }

    @org.junit.Test
    public void testAddSong() throws Exception {
        Artist art2;
        art2 = new Artist("TOMB", "Rap", "Poland");
        Artist art3;
        art3 = new Artist("Sylena Johnson", "R&B", "USA");
        Song song1;
        song1 = new Song("Laboraptorium", art2, 3, 11);
        Song song2;
        song2 = new Song("Alibumaye", art2, 4, 6);
        Song song3;
        song3 = new Song("Slowly", art3, 4, 38);
        ArrayList<Song> List1;
        List1 = new ArrayList<Song>();
        List1.add(song1);
        List1.add(song2);
        Playlist1.setSongList(List1);
        Playlist1.getSongList();
        Playlist1.addSong(song3);
        assertTrue(Playlist1.getSong("Slowly") == song3);
    }

    @org.junit.Test
    public void testRemoveSong() throws Exception {
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
        Playlist1.getSongList();
        Playlist1.removeSong(song2);
        assertTrue(Playlist1.getSong("Alibumaye") == null);
    }
}

