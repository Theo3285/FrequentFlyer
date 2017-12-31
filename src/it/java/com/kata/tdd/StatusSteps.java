package com.kata.tdd;

import com.kata.tdd.domain.FrequentFlyer;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StatusSteps implements En {

    FrequentFlyer member;

    public StatusSteps() {
        Given("^\"([^\"]*)\" \"([^\"]*)\" is a \"([^\"]*)\" Frequent Flyer member$", (String firstName, String lastName, String status) -> {
            member = new FrequentFlyer(firstName, lastName, status);
        });
        And("^he has \"([^\"]*)\" status points$", (String points) -> {
            member.setPoints(Integer.valueOf(points));
        });
        When("^he earns \"([^\"]*)\" extra status points$", (String points) -> {
            member.earnsExtraPoints(Integer.valueOf(points));
        });
        Then("^he should have a status of \"([^\"]*)\"$", (String expectedStatus) -> {
            assertThat(member.calculateNewStatus(), is(expectedStatus));
        });
        Given("^I am a \"([^\"]*)\" Frequent Flyer member$", (String status) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^I should earn a status bonus of \"([^\"]*)\"$", (String points) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
