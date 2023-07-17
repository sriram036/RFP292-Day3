package com.bridgelabz;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] array = {12,63,749,983,12,372,749};
        System.out.println("These are the Duplicate Numbers of the given array:");
        for(int i = 0; i < 7; i++){
            for(int j = i+1; j < 7; j++){
                if(array[i] == array[j]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
