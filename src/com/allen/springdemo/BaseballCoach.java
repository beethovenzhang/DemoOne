package com.allen.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins batting";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
