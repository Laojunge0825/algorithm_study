package com.shuke.algorithm_study.sort_algorithm.quick_sort;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 舒克、舒克
 * @date 2025/6/5 10:41
 * @description 快速排序
 */
public class QuickSort {

    private static final Logger log = LoggerFactory.getLogger(QuickSort.class);

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4, 6, 7, 9, 8};
        log.info("排序前的数组：{}", arr);
        quickSort(arr, 0, arr.length - 1);
        log.info("排序后的数组：{}", arr);
    }

    public static void quickSort(int[] arr, int left, int right) {

        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }

    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left+1;

        for (int j = left+1; j <= right; j++){
            if (arr[j] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        log.info("pivot:{},arr:{}",pivot,arr);
        int temp = arr[left];
        arr[left] = arr[i-1];
        arr[i-1] = temp;

        return i-1;
    }
}
