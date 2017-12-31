package com.kata.tdd;

import com.kata.tdd.domain.FrequentFlyer;
import com.kata.tdd.domain.FrequentFlyerRepository;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FrequentFlyerSteps implements En {

    public FrequentFlyerSteps(FrequentFlyerRepository frequentFlyerRepository) {
        Given("^Some Frequent Flyer Members:$", (DataTable dataTable) -> {
            List<Map<String, String>> dataMaps = dataTable.asMaps(String.class, String.class);
            dataMaps.forEach(dataMap -> {
                FrequentFlyer member = new FrequentFlyer(
                        dataMap.get("firstName"),
                        dataMap.get("lastName"),
                        dataMap.get("status"));
                frequentFlyerRepository.add(member);
                assertTrue(frequentFlyerRepository.all().contains(member));
            });
        });

        And("^I should earn \"([^\"]*)\" points in all$", (String points) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^\"([^\"]*)\" is a Frequent Flyer member$", (String firstName) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
