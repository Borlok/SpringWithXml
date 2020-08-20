package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Player player = (Player) context.getBean("player");
        player.playMusic();
        System.out.println(player.getVolume() + " " + player.getName());
    }

}
