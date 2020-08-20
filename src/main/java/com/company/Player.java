package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Autowired
    @Qualifier("classical")
    private Music music;
    @Value("${variable.volume}")
    private int volume;
    @Value("${variable.name}")
    private String name;

    public void playMusic() {
        music.play();
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
