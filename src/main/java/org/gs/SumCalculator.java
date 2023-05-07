package org.gs;

public class SumCalculator {
    public int sum(int n) {

        validateInput(n);

        int result = 0;

        for (int i = 1; i <= n ; i++) {
            result += i;
        }
        return result;
    }

    private static void validateInput(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("Incorrect input value. O or negative values are not acceptable");
        }
    }
}