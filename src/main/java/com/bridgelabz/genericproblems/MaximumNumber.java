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
    public static String findMax(String str1, String str2, String str3) {
        String max = str1;

        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }

        return max;
    }
    public static void main(String[] args) {

        Float num1 = 10.5f, num2 = 5.2f, num3 = 3.1f;
        System.out.println("Max of 10.5, 5.2, 3.1 is : " + findMax(num1, num2, num3));

        Float a2 = 3.3f, b2 = 12.8f, c2 = 7.4f;
        System.out.println("Max of (3.3, 12.8, 7.4) is: " + findMax(a2, b2, c2));

        Float a3 = 2.2f, b3 = 4.4f, c3 = 10.1f;
        System.out.println("Max of (2.2, 4.4, 10.1) is: " + findMax(a3, b3, c3));

        String s1 = "Zebra", s2 = "Elephant", s3 = "Lion";
        System.out.println("Max of (Zebra, Elephant, Lion) is: " + findMax(s1, s2, s3));

        String str1 = "Apple", str2 = "Peach", str3 = "Banana";
        System.out.println("Max of (Apple, Peach, Banana) is : " + findMax(str1, str2, str3));

        String st1 = "Cherry", st2 = "Apricot", st3 = "Mango";
        System.out.println("Max of (Cherry, Apricot, Mango) is: " + findMax(st1, st2, st3));
    }
}
