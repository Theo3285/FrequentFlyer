package com.kata.tdd.configuration;

import com.kata.tdd.adapters.InMemoryFrequentFlyerRepository;
import com.kata.tdd.domain.FrequentFlyerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RepositoriesConfiguration {

    @Bean
    @Scope("cucumber-glue")
    public FrequentFlyerRepository frequentFlyerRepository () {
        return new InMemoryFrequentFlyerRepository();
    }
}
