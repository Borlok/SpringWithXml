package com.company;

import org.springframework.stereotype.Component;

@Component("classical")
public class ClassicalMusic implements Music{
    @Override
    public void play() {
        System.out.println("Играет классика");
    }
}
