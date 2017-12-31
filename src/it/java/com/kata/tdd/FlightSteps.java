package com.kata.tdd;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class FlightSteps implements En {
    public FlightSteps() {
        Given("^I need to know the details of flight number FH-(\\d+)$", (Integer arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        When("^I request the details about this flight$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^I should receive the following:$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        When("^I fly on a flight that is worth \"([^\"]*)\" base points$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
