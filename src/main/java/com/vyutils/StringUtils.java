package com.vyutils;

// Utility class for string operations
public class StringUtils {

    // Reverses a string
    public static String reverse(String text) {

        return new StringBuilder(text)
                .reverse()
                .toString();
    }

    // Checks if a string is a palindrome
    public static boolean isPalindrome(String text) {

        String reversed =
                new StringBuilder(text)
                        .reverse()
                        .toString();

        return text.equalsIgnoreCase(reversed);
    }

    // Converts string to uppercase
    public static String toUpper(String text) {

        return text.toUpperCase();
    }

    // Counts characters
    public static int countCharacters(String text) {

        return text.length();
    }
}