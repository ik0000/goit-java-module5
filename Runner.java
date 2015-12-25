package com.goit.module5;
 import java.util.Arrays;
public class Runner {
    public static void main(String[] args) {
        //int min;
        //double temp;
        //int[] arrOfInt = new [5];
        //double[] doubleArray = {1.1, 4.2, 3.3, 6.6, 5.5, 0.0};
        int[] intArray = {1, 2, 4, 5, 6, 2, 8};

        System.out.println("For given array:");
        for (double element : intArray) {
            System.out.println(element);
        }
        System.out.println("Smallest is : " + sortUtil.findMin(intArray));
        System.out.println("Bigget is : " + sortUtil.findMax(intArray));
        sortUtil.bubbleSort(intArray);

        System.out.println("Sorted array(Bubble sort):");
        for (double element : intArray) {
            System.out.println(element);
        }
    }
}
