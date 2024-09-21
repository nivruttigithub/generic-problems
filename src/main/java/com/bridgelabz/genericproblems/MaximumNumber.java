package com.bridgelabz.genericproblems;

import java.util.Arrays;

public class MaximumNumber <T extends Comparable<T>> {
    private T[] elements;

    @SafeVarargs
    public MaximumNumber(T... elements) {
        this.elements = elements;
    }

    // Instance method to find the maximum of the instance variables
    public T testMaximum() {
        return MaximumNumber.testMaximum(elements);
    }

    // Static method to find the maximum of multiple elements using varargs
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... elements) {
        if (elements == null || elements.length == 0) {
            throw new IllegalArgumentException("No elements provided");
        }

        // Sorting the array and returning the maximum (last element)
        Arrays.sort(elements);
        return elements[elements.length - 1];  // Max is the last element after sorting
    }

    public static void main(String[] args) {

        MaximumNumber<Integer> integerMax = new MaximumNumber<>(10, 5, 3);
        System.out.println("Max of 10, 5, 3 is: " + integerMax.testMaximum());  // Output: 10

        MaximumNumber<Float> floatMax = new MaximumNumber<>(10.5f, 5.2f, 3.1f);
        System.out.println("Max of 10.5, 5.2, 3.1 is: " + floatMax.testMaximum());  // Output: 10.5

        MaximumNumber<String> stringMax = new MaximumNumber<>("Zebra", "Elephant", "Lion");
        System.out.println("Max of (Zebra, Elephant, Lion) is: " + stringMax.testMaximum());
    }
}
