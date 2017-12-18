package com.kata.tdd.model;

public class FrequentFlyer {

    private int points;

    public FrequentFlyer(String firstName, String lastName, String status) {

    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void earnsExtraPoints(int points) {
        this.points += points;
    }

    public String getStatus() {
        return Status.by(points);
    }
}
