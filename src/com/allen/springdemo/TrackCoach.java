package com.allen.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 60 mins running";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! " + this.fortuneService.getFortune();
    }
}
