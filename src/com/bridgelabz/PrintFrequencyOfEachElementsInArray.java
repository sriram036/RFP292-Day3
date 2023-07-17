package com.bridgelabz;

public class PrintFrequencyOfEachElementsInArray {
    public static void main(String[] args) {

        int[] array = {1,6,3,6,2};
        boolean visited[] = new boolean[5];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < array.length; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(array[i] + " " + count);
        }
    }
}
