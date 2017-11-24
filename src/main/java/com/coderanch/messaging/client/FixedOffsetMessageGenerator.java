package com.coderanch.messaging.client;

import com.coderanch.messaging.domain.Person;
import com.coderanch.messaging.template.v1.MessageTemplate;

public class FixedOffsetMessageGenerator {
    public String generate(Person person) {
        int nameWidth = MessageTemplate.NAME_WIDTH;
        int favColourWidth = MessageTemplate.FAV_COLOUR_WIDTH;
        return String.format("%-" + nameWidth + "s" , person.getName()) + String.format("%-" + favColourWidth + "s", person.getFavColour());
    }

    public static void main(String[] args) {
        FixedOffsetMessageGenerator generator = new FixedOffsetMessageGenerator();
        System.out.println(generator.generate(new Person("Tim", "Blue")));
    }
}
