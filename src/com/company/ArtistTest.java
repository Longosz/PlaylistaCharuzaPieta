package com.company;

import org.junit.Test;
import static org.junit.Assert.*;


public class ArtistTest extends junit.framework.TestCase{
    Artist art1;
    public ArtistTest() {}


    protected void setUp() throws Exception {
        art1 = new Artist("Sean Paul", "Dancehall", "Jamaica");
    }


    protected void tearDown() throws Exception
    {}


    @org.junit.Test
    public void testSetName() throws Exception {
        art1.setName("Damian Marley");
        assertTrue(art1.getName()=="Damian Marley");
    }




    @org.junit.Test
    public void testSetGenre() throws Exception {
        art1.setGenre("Reggae");
        assertTrue(art1.getGenre()=="Reggae");
    }


    @org.junit.Test
    public void testSetCountry() throws Exception {
        art1.setCountry("USA");
        assertTrue(art1.getCountry()=="USA");

    }
}