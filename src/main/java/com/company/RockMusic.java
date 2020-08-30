package com.company;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public void play() {
        System.out.println("Играет рок");
    }
}
