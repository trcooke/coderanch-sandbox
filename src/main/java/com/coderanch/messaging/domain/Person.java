package com.coderanch.messaging.domain;

public class Person {
    private String name;
    private String favColour;

    public Person(String name, String favColour) {
        this.name = name;
        this.favColour = favColour;
    }

    public String getName() {
        return name;
    }

    public String getFavColour() {
        return favColour;
    }
}
