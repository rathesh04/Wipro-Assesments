package com.java;
import java.util.Arrays;
public class ArraySortExample {
    public static void main(String[] args) {
        int arr[] = {45, 10, 78, 25, 60};      
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("Smallest number: " + arr[0]);
        System.out.println("Largest number: " + arr[arr.length - 1]);
    }
}
