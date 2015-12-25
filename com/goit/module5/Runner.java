package com.goit.module5;

 import java.util.Arrays;
public class Runner {
    public static void main(String[] args) {

        int[] intArray = { 6, 2, 8, -100 ,-20, 100, 50};

        System.out.println("For given array:");
        for (double element : intArray) {
            System.out.println(element);
        }
        System.out.println("Smallest is : " + SortUtil.findMin(intArray));
        System.out.println("Bigget is : " + SortUtil.findMax(intArray));
        SortUtil.bubbleSort(intArray);

        System.out.println("Sorted array(Bubble sort):");
        for (double element : intArray) {
            System.out.println(element);
        }
    }
}
