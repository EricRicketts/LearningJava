package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Album {

    private String name, artist;
    private ArrayList<Song> songs;

    private Song findSong(String title) {
        for (Song song: songs) {
            if (song.getTitle().equalsIgnoreCase(title)) return song;
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        Song song = new Song(title, duration);
        if (Objects.isNull(this.findSong(title))) {
            songs.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = this.findSong(title);
        if (Objects.isNull(song)) {
            return false;
        }
        playList.add(song);
        return true;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playList) {
        int index = track - 1;
        if (index > -1 && index < songs.size()) {
            Song song = songs.get(index);
            playList.add(song);
            return true;
        }
        return false;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }
}
