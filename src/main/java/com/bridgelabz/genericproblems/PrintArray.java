package com.bridgelabz.genericproblems;

public class PrintArray {

    public static void toPrint(Integer[] intArray) {
        for (Integer element : intArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void toPrint(Double[] doubleArray) {
        for (Double element : doubleArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void toPrint(Character[] charArray) {
        for (Character element : charArray) {
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
