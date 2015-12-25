package com.goit.module5;

public class sortUtil {
    public static int findMin(int[] array){
         int min = 0;
        for (int i = 0; i < array.length; i++) {
        min = array[0];
        if (array[i] < min) { min = array[i]; }
    }
            return min;
        }
public static int findMax(int[] array){
        int max = 0;
    for (int i = 0; i < array.length; i++) {
        max = array[0];
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
    }
    public static void bubbleSort(int[] array){
        boolean swapOccured = true;
        while (swapOccured) {
            swapOccured = false;
            for(int i = 0; i<array.length -1; i++ )
                if (array[i] > array[i + 1]) {
                    int tempVar = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempVar;
                    swapOccured = true;
                }
            }
        }

    }

