package com.bridgelabz.genericproblems;

public class MaximumNumber {
    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1; 

        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        //1st Position
        Integer num1 = 10, num2 = 5, num3 = 3;
        System.out.println("Max of 10, 5, 3 is : " + findMax(10, 5, 3));
        //2nd Position
        Integer a2 = 3, b2 = 12, c2 = 7;
        System.out.println("Max of (3, 12, 7) is: " + findMax(a2, b2, c2));

    }
}
