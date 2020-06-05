package com.allen.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Spend 60 mins running";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! " + this.fortuneService.getFortune();
    }

    // Add an init method
    public void doMyStartUpStuff() {
        System.out.println("TrackCoach: inside method doMyStartUpStuff");
    }

    // add a destroy method
    public void doMyCleanUpStuff() {
        System.out.println("TrackCoach: inside method doMyCleanUpStuff");
    }
}
