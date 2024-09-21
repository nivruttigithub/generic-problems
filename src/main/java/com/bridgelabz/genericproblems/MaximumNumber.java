package com.bridgelabz.genericproblems;

public class MaximumNumber {

    public static Float findMax(Float num1, Float num2, Float num3) {
        Float max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }
    public static void main(String[] args) {

        Float num1 = 10.5f, num2 = 5.2f, num3 = 3.1f;
        System.out.println("Max of 10.5, 5.2, 3.1 is : " + findMax(num1, num2, num3));

        Float a2 = 3.3f, b2 = 12.8f, c2 = 7.4f;
        System.out.println("Max of (3.3, 12.8, 7.4) is: " + findMax(a2, b2, c2));
    }
}
