package com.example.firstboot.practice;

import java.util.Arrays;

/**
 * 快排算法
 */
public class QuickSort {
    public static void main(String[] args) {
//        int[] array = {-1, 79, 0, 23, -567, 70, 55, -2, -55, -77};
        int[] array = {2, 3, 0, -6, 5, 55, 32, 11};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(int[] array, int left, int right) {
        int l = left;//左下标
        int r = right;//右下标
        //中轴
        int pivot = array[(left + right) / 2];
        //临时交换
        int temp = 0;
        //while循环的目的比pivot小的放左边 比pivot大的放右边
        while (l < r) {
            //在pivot左边一直找，找到大于等于pivot值，才退出
            while (array[l] < pivot) {
                l += 1;
            }
            //在pivot右边一直找，找到小于等于pivot值，才退出
            while (array[r] > pivot) {
                r -= 1;
            }
            //如果l>=r,说明pivot左右两边的值已经分配好了,左边小于或等于pivot，右边大于或等于pivot
            if (l >= r) {
                break;
            }
            //交换
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            //如果交换完后，发现array[l] == pivot值 相等 r--,前移
            if (array[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现array[r] == pivot值 相等 l++,后移
            if (array[r] == pivot) {
                l += 1;
            }
        }
        //如果l==r,必须l++,r--,否者为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if (left < r) {
            quickSort(array, left, r);
        }
        //向左递归
        if (right > l) {
            quickSort(array, l, right);
        }
    }
}
