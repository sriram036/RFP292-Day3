package com.bridgelabz;

public class PrintArrayElements {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array "+count+" value is "+array[i]);
            count++;
        }
    }
}
