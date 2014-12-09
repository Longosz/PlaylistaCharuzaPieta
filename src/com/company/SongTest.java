package com.company;

import org.junit.Test;
import static org.junit.Assert.*;



public class SongTest extends junit.framework.TestCase{

    Song song1;
    public SongTest() {}


    protected void setUp() throws Exception {
        Artist art2;
        art2 = new Artist("TOMB","Rap","Poland");
        song1 = new Song("Laboraptorium", art2, 3, 11);
    }


    protected void tearDown() throws Exception
    {}

    @org.junit.Test
    public void testSetArtist() throws Exception {
        Artist art3;
        art3 = new Artist("Sylena Johnson","R&B","USA");
        song1.setArtist(art3);
        assertTrue(song1.getArtist()==art3);

    }


    @org.junit.Test
    public void testSetTitle() throws Exception {
        song1.setTitle("Slowly");
        assertEquals(song1.getTitle()=="Slowly");

    }

    @org.junit.Test
    public void testSetMinutes() throws Exception {
        song1.setMinutes(4);
        assertTrue(song1.getMinutes()==4);

    }


    @org.junit.Test
    public void testSetSeconds() throws Exception {
        song1.setSeconds(38);
        assertTrue(song1.getSeconds()==38);

    }


}