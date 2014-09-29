package com.coderanch.mocklocalmethod;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ActualThingsToBeDoneTest {

    @Test
    public void doAllTheThings_shouldCall_doTheFirstThing_and_doTheSecondThing() {
        TestableThingsToBeDone thingsToBeDone = new TestableThingsToBeDone();

        thingsToBeDone.doAllTheThings();

        assertThat(thingsToBeDone.hasTheFirstThingBeenDone(), is(true));
        assertThat(thingsToBeDone.hasTheSecondThingBeenDone(), is(true));
    }

    private class TestableThingsToBeDone extends ActualThingsToBeDone {
        private boolean firstThingDone = false;
        private boolean secondThingDone = false;

        @Override
        protected void doTheFirstThing() {
            this.firstThingDone = true;
        }

        @Override
        protected void doTheSecondThing() {
            this.secondThingDone = true;
        }

        public boolean hasTheFirstThingBeenDone() {
            return firstThingDone;
        }

        public boolean hasTheSecondThingBeenDone() {
            return secondThingDone;
        }
    }
}
