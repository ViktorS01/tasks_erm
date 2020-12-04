package ru.sychev.music;

public class MusicalTrack {
    private String name;
    private Author author;
    private Album album;

    public MusicalTrack (String name, Author author, Album album){
        this.name = name;
        this.album = album;
        this.author = author;
    }

    public String toString (){
        if (author == null)
            return name + ", автор: " + album.getAuthor();
        else return name + ", авторы: " + author + ", " + album.getAuthor();
    }

    public Album getAlbum() {
        return album;
    }

}
