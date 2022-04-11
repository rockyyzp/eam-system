package com.example.firstboot.practice;

import java.util.Arrays;

/**
 * 排序
 */
public class Test {

    public static void main(String[] args) {
        int[] array = {2, 3, 0, -6, 5, 55, 32, 11};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int pivot = array[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (array[l] < pivot) {
                l += 1;
            }
            while (array[r] > pivot) {
                r -= 1;
            }
            if (l >= r) {
                break;
            }
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            if (array[l] == pivot) {
                r -= 1;
            }
            if (array[r] == pivot) {
                l += 1;
            }
        }
        if (l == r) {
            l += 1;
            r -= 1;
        }
        if (left < r) {
            quickSort(array, left, r);
        }
        if (right > l) {
            quickSort(array, l, right);
        }

    }

}

