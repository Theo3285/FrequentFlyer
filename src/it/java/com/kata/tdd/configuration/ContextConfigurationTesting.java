package com.kata.tdd.configuration;

import cucumber.api.java8.En;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        RepositoriesConfiguration.class
})
public class ContextConfigurationTesting implements En {
}
