package org.example.homework10.task1;

import java.util.ArrayList;

public class Album {
    private String title;
    private SongList songList;

    public Album(String title) {
        this.title = title;
        this.songList = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public boolean addSong(Song song) {
        return this.songList.addSong(song);
    }

    public Song findSongByTitle(String title) {
        return this.songList.findSongByTitle(title);
    }

    public Song findSongByTrackNumber(int trackNumber) {
        return this.songList.findSongByTrackNumber(trackNumber);
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if (findSongByTitle(song.getTitle()) != null) {
                return false;
            }
            songs.add(song);
            return true;
        }

        public Song findSongByTitle(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSongByTrackNumber(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}
