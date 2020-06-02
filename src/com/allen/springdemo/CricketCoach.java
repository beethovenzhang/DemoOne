package com.allen.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String team;
    private String email;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach: inside setter method");
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
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
