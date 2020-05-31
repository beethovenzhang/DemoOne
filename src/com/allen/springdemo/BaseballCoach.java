package com.allen.springdemo;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins running";
    }
}
