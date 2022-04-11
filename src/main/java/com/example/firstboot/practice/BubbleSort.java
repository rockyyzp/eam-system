package com.example.firstboot.practice;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a={6,44,3,2,2,5,6,7,88,34,3,2};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));

    }

    private static int[] sort(int[] array){
        int temp=0;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1]<array[j]){
                    temp=array[j];
                    array[j]=array[j+1] ;
                    array[j+1]=temp;

                }
            }
        }
        return array;
    }
}
