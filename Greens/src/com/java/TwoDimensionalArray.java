package com.java;
public class TwoDimensionalArray {
    public static void main(String[] args) {

        int numbers[][] = {
                {10, 20},
                {30, 40}
        };

        System.out.println("2D Array Elements:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
