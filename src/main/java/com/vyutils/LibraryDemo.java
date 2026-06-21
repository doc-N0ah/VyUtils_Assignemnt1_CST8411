package com.vyutils;

// Demonstrates library usage
public class LibraryDemo {

    public static void main(String[] args) {

        System.out.println(
                "Factorial of 5 = "
                        + MathUtils.factorial(5));

        System.out.println(
                "Is 13 prime? "
                        + MathUtils.isPrime(13));

        System.out.println(
                "Percentage = "
                        + MathUtils.percentage(50, 200));

        System.out.println(
                "Reverse = "
                        + StringUtils.reverse("Hello"));

        System.out.println(
                "Palindrome = "
                        + StringUtils.isPalindrome("madam"));
    }
}