package com.kata.tdd;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class AuthenticationSteps implements En {
    public AuthenticationSteps() {
        And("^\"([^\"]*)\" has registered online with a password of \"([^\"]*)\"$", (String firstName, String password) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        When("^\"([^\"]*)\" logs on with password \"([^\"]*)\"$", (String firstName, String password) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^he should be given access to the site$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^he should be informed that his password was incorrect$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Given("^I am authentified as \"([^\"]*)\"$", (String firstName) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
