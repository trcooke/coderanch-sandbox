package com.coderanch.mocklocalmethod;

public class ActualThingsToBeDone implements ThingsToBeDone {
    @Override
    public void doAllTheThings() {
        doTheFirstThing();
        doTheSecondThing();
    }

    protected void doTheFirstThing() {
        // Hard to test stuff
    }

    protected void doTheSecondThing() {
        // Hard to test stuff
    }
}
