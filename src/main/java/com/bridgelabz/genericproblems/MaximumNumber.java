package com.bridgelabz.genericproblems;

public class MaximumNumber <T extends Comparable<T>> {
    private T num1, num2, num3;

    public MaximumNumber(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public T findMax() {
        return MaximumNumber.findMax(num1, num2, num3);
    }

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

        MaximumNumber<Integer> integerMax = new MaximumNumber<>(10, 5, 3);
        System.out.println("Max of 10, 5, 3 is: " + integerMax.findMax());  // Output: 10

        MaximumNumber<Float> floatMax = new MaximumNumber<>(10.5f, 5.2f, 3.1f);
        System.out.println("Max of 10.5, 5.2, 3.1 is: " + floatMax.findMax());  // Output: 10.5

        MaximumNumber<String> stringMax = new MaximumNumber<>("Zebra", "Elephant", "Lion");
        System.out.println("Max of (Zebra, Elephant, Lion) is: " + stringMax.findMax());
    }
}
