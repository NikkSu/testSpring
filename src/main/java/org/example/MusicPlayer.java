package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();
    public MusicPlayer(ArrayList music) {
        this.musicList = music;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public MusicPlayer () {}


    public void playMusic() {
        for (Music music : this.musicList) {
            System.out.println(music.getSong());
        }
    }
    }


