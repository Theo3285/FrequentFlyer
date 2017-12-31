package com.kata.tdd.adapters;

import com.kata.tdd.domain.FrequentFlyer;
import com.kata.tdd.domain.FrequentFlyerRepository;

import java.util.LinkedHashSet;
import java.util.Set;

public class InMemoryFrequentFlyerRepository implements FrequentFlyerRepository {

    private final Set<FrequentFlyer> members = new LinkedHashSet<>();

    public void add(FrequentFlyer member) {
        members.add(member);
    }

    @Override
    public Set<FrequentFlyer> all() {
        return members;
    }
}
