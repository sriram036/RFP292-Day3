package com.bridgelabz;

public class ElementInEvenPosition {
    public static void main(String[] args) {
        int[] array = {12,63,39,983,3,372,749};
        for(int i = 0; i < array.length; i++){
            if(i !=0 && i%2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
