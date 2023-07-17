package com.bridgelabz;

public class ElementsInReverseOrder {
    public static void main(String[] args) {
        int[] array = {12,63,39,983,3,372,749};
        System.out.println("The array elements are ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nThe array elements in reverse order are ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
