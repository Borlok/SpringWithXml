package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Autowired
    @Qualifier("rockMusic")
    private Music music;

    public void playMusic() {
        music.play();
    }
}
