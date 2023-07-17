package com.bridgelabz;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = {12,63,39,983,3,372,749};
        int largest = 0;
        for (int i = 0; i < array.length; i++){
            if (largest < array[i]){
                largest = array[i];
            }
        }
        System.out.println("The Largest Number is " + largest);
    }
}
