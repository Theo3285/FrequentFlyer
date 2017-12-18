package com.kata.tdd.model;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Status {
    private final static NavigableMap<Integer, String> statusByPoints = new TreeMap<Integer, String>() {{
        put(1, "Bronze");
        put(300, "Silver");
        put(700, "Gold");
        put(1500, "Platinum");
    }};

    static String by(int points) {
        final Integer key = statusByPoints.floorKey(points);
        return (statusByPoints.get(key));
    }
}