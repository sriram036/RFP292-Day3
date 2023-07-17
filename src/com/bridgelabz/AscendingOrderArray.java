package com.bridgelabz;

public class AscendingOrderArray {
    public static void main(String[] args) {
        int[] array = {12,3,39,983,3,372,749};
        int len = 7;
        int temp = 0;
        System.out.println("The given array is :");
        for(int i = 0; i < 7; i++){
            System.out.print(array[i]+" ");
        }
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nThe Ascending order of given array is :");
        for(int i = 0; i < 7; i++){
            System.out.print(array[i]+" ");
        }
    }
}
