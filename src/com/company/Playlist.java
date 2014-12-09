package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Playlist {

    private String name;
    private ArrayList<Song> songList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<Song> songList) {
        this.songList = songList;
    }

    public Playlist() {
        name = "Untitled";
        songList = new ArrayList<Song>();
    }

    public Playlist(String name) {
        this.name = name;
        songList = new ArrayList<Song>();
    }
/*/
    public Playlist(ArrayList<Song> l, String n){
        this.name = n;
        for (int i=0; i<l.size();i=i+1)
        {

            songList.add((Song)l.get(0));
            
        }
        ;
        
        
    }/*/

    public Playlist(ArrayList<Song> l, String n){
        this.name = n;
        songList = new ArrayList<Song>();
        this.songList=l;


    }
    
    public boolean clear() {
        songList.clear();
        return true;
    }

    public boolean addSong(Song s) {
        songList.add(s);
        return true;
    }

    public Song removeSong(Song s) {
        songList.trimToSize();
        if (songList.contains(s)) {
            songList.remove(s);
            return s;
        }
        return null;

    }

    public Song getSong(String title) {
        songList.trimToSize();
        for (int i = 0; i < songList.size(); i = i + 1) {
            if (songList.get(i).getTitle().equals(title)) {

                return songList.get(i);

            }
        }
        return null;
    }
}
