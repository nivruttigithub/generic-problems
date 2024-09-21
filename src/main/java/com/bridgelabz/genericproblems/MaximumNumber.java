package com.bridgelabz.genericproblems;

import java.util.Arrays;

public class MaximumNumber <T extends Comparable<T>> {
    private T[] elements;

    @SafeVarargs
    public MaximumNumber(T... elements) {
        this.elements = elements;
    }

    public T testMaximum() {
        T max = MaximumNumber.testMaximum(elements);
        printMax(max);
        return max;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... elements) {
        if (elements == null || elements.length == 0) {
            throw new IllegalArgumentException("No elements provided");
        }

        Arrays.sort(elements);
        return elements[elements.length - 1];
    }

    public static <T> void printMax(T max) {
        System.out.println("The maximum value is: " + max);
    }
    public static void main(String[] args) {

        MaximumNumber<Integer> integerMax = new MaximumNumber<>(10, 5, 3);
         integerMax.testMaximum();

        MaximumNumber<Float> floatMax = new MaximumNumber<>(10.5f, 5.2f, 3.1f);
        floatMax.testMaximum();

        MaximumNumber<String> stringMax = new MaximumNumber<>("Zebra", "Elephant", "Lion");
        stringMax.testMaximum();
    }
}
