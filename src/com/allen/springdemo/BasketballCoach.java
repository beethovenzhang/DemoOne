package com.allen.springdemo;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    // Constructor for dependency injection
    public BasketballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 100 dribbles";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
