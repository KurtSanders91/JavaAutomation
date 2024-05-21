package org.example.homework10.task1;

public class Main {
    public static void main(String[] args) {
        Album album = new Album("Greatest Hits");

        album.addSong(new Song("Song 1", 4.22));
        album.addSong(new Song("Song 2", 3.55));
        album.addSong(new Song("Song 3", 5.01));

        System.out.println("Find song by title 'Song 1': " + album.findSongByTitle("Song 1"));
        System.out.println("Find song by title 'Song 4': " + album.findSongByTitle("Song 4"));

        System.out.println("Find song by track number 1: " + album.findSongByTrackNumber(1));
        System.out.println("Find song by track number 4: " + album.findSongByTrackNumber(4));
    }
}
