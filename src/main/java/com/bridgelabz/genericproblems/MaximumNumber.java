package com.bridgelabz.genericproblems;

public class MaximumNumber {

public static <T extends Comparable<T>> T findMax(T num1, T num2, T num3) {
    T max = num1;

    if (num2.compareTo(max) > 0) {
        max = num2;
    }
    if (num3.compareTo(max) > 0) {
        max = num3;
    }

    return max;
}
    public static void main(String[] args) {

        System.out.println("Max of 10, 5, 3 is: " + findMax(10, 5, 3));
        System.out.println("Max of (3, 12, 7) is: " + findMax(3, 12, 7));
        System.out.println("Max of (2, 4, 10) is: " + findMax(2, 4, 10));

        System.out.println("Max of 10.5, 5.2, 3.1 is: " + findMax(10.5f, 5.2f, 3.1f));
        System.out.println("Max of (3.3, 12.8, 7.4) is: " + findMax(3.3f, 12.8f, 7.4f));
        System.out.println("Max of (2.2, 4.4, 10.1) is: " + findMax(2.2f, 4.4f, 10.1f));

        System.out.println("Max of (Zebra, Elephant, Lion) is: " + findMax("Zebra", "Elephant", "Lion"));
        System.out.println("Max of (Apple, Peach, Banana) is: " + findMax("Apple", "Peach", "Banana"));
        System.out.println("Max of (Cherry, Apricot, Mango) is: " + findMax("Cherry", "Apricot", "Mango"));
}
}
