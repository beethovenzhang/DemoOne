package com.allen.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach: inside setter method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 30 mins";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
