package com.cme.codingfuntime;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RotatedPalindromeTest {

    @Test
    public void unrotatedPalindrome() {
        assertThat(RotatedPalindrome.evaluate("aba"), is(true));
    }

    @Test
    public void unrotatedNotPalindrome() {
        assertThat(RotatedPalindrome.evaluate("abab"), is(false));
    }

    @Test
    public void rotatedPalindrome() {
        assertThat(RotatedPalindrome.evaluate("aab"), is(true));
    }
}
