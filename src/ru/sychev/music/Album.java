package ru.sychev.music;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private Author author;
    private List<MusicalTrack> tracks = new ArrayList<>();

    public Album (String name, Author author){
        this.author = author;
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTrack(MusicalTrack track) {
        if (track.getAlbum() != this)
            throw new IllegalArgumentException();

        tracks.add(track);
    }

    public List <MusicalTrack> getTracks() {
        return new ArrayList<>(tracks);
    }
}