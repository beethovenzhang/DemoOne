package com.allen.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] fortunes;

    public RandomFortuneService() {
        this.fortunes = new String[3];
        this.fortunes[0] = "Lucky you!";
        this.fortunes[1] = "You are very lucky!";
        this.fortunes[2] = "Good luck!";
    }

    @Override
    public String getFortune() {
        int rand = new Random().nextInt(fortunes.length);
        return fortunes[rand];
    }
}
