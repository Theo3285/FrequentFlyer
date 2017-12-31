package com.kata.tdd.domain;

import java.util.Set;

public interface FrequentFlyerRepository {
    void add(FrequentFlyer member);

    Set<FrequentFlyer> all();
}
