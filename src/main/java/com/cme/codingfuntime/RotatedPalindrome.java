package com.cme.codingfuntime;

import java.util.ArrayList;
import java.util.List;

public class RotatedPalindrome {
    public static boolean evaluate(String sequence) {
        List<String> sequences = getSequences(sequence);
        boolean isPalindrome = false;
        for (String seq : sequences) {
            if (seq.equals(new StringBuilder(seq).reverse().toString())) {
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }

    private static List<String> getSequences(String sequence) {
        List<String> sequences = new ArrayList<>();
        for (int i = 0; i < sequence.length(); i++) {
            sequences.add(sequence.substring(sequence.length() - i) + sequence.substring(0, sequence.length() - i));
        }
        return sequences;
    }

    public static void main(String[] args) {
        System.out.println(getSequences("aab"));
    }
}
