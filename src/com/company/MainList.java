package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class MainList {

    private ArrayList<Playlist> Listplaylist;

    public MainList() {Listplaylist = new ArrayList<Playlist>();
    }
    public boolean addPlaylist(Playlist s) {
        Listplaylist.add(s);
        return true;
    }

    public Playlist removePlaylist(Playlist s) {
        Listplaylist.trimToSize();
        if (Listplaylist.contains(s)) {
            Listplaylist.remove(s);
            return s;
        }
        return null;

    }

    public Playlist getPlaylist(String name) {
        Listplaylist.trimToSize();
        for (int i = 0; i < Listplaylist.size(); i = i + 1) {
            if (Listplaylist.get(i).getName().equals(name)) {

                return Listplaylist.get(i);

            }
        }
        return null;
    }
}