package com.company;

public class Player {
    private Music music;

    public Player(Music music) {
        this.music = music;
    }

    public void playMusic() {
        music.play();
    }
}
