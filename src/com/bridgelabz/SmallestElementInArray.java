package com.bridgelabz;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] array = {12,63,39,983,3,372,749};
        int smallest = 1000;
        for (int i = 0; i < array.length; i++){
            if (smallest > array[i]){
                smallest = array[i];
            }
        }
        System.out.println("The smallest Number is " + smallest);
    }
}
