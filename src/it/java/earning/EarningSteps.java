package earning;

import com.kata.tdd.model.FrequentFlyer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EarningSteps {

    FrequentFlyer member;

    @Given("^\"([^\"]*)\" \"([^\"]*)\" is a (.*) Frequent Flyer member$")
    public void isAFrequentFlyerMember(String firstName, String lastName, String status)  {
        member = new FrequentFlyer(firstName, lastName, status);
    }

    @Given("^(?:s?)he has (\\d+) status points$")
    public void hasStatusPoints(int points) {
        member.setPoints(points);

    }

    @When("^(?:s?)he earns (\\d+) extra status points$")
    public void earnsExtraStatusPoints(int points) {
        member.earnsExtraPoints(points);
    }

    @Then("^(?:s?)he should have a status of (.*)$")
    public void shouldHaveAStatusOf(String expectedtatus) {
        assertThat(member.getStatus(), is(expectedtatus));
    }
}
