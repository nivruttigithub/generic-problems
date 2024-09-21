package com.bridgelabz.genericproblems;

public class PrintArray {

    public static <T> void toPrint(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        
        System.out.print("Integer Array: ");
        toPrint(intArray);

        System.out.print("Double Array: ");
        toPrint(doubleArray);

        System.out.print("Character Array: ");
        toPrint(charArray);
    }
}
