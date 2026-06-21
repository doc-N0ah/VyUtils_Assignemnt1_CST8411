package com.vyutils;

// Utility class for mathematical operations
public class MathUtils {

    // Calculates factorial of a number
    public static long factorial(int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // Checks if a number is prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Calculates percentage
    public static double percentage(double value, double total) {

        if (total == 0) {
            throw new ArithmeticException("Total cannot be zero");
        }

        return (value / total) * 100;
    }

    // Calculates square root
    public static double squareRoot(double number) {

        if (number < 0) {
            throw new ArithmeticException("Negative number");
        }

        return Math.sqrt(number);
    }

    // Calculates power
    public static double power(double base, double exponent) {

        return Math.pow(base, exponent);
    }
}