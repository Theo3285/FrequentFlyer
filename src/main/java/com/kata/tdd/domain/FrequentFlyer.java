package com.kata.tdd.domain;

public class FrequentFlyer {

    private int points;
    private String firstName;
    private String lastName;
    private String status;

    public FrequentFlyer(String firstName, String lastName, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void earnsExtraPoints(int points) {
        this.points += points;
    }

    public String calculateNewStatus() {
        this.status = Status.by(points);
        return this.status;
    }

    @Override
    public String toString() {
        return "FrequentFlyer{" +
                "points=" + points +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
