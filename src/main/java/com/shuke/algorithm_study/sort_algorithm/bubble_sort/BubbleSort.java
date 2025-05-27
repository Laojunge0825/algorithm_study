package com.shuke.algorithm_study.sort_algorithm.bubble_sort;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 舒克、舒克
 * @date 2025/5/27 17:12
 * @description 冒泡排序
 */
public class BubbleSort {

    private static final Logger log = LoggerFactory.getLogger(BubbleSort.class);

    public static void main(String[] args) {
        int[] arr = {88,66,11,96,33,77,55,44,22,99};

        log.info("排序前的数组：{}", arr);

        bubbleSort(arr);

        log.info("排序后的数组：{}", arr);
    }

    private static void bubbleSort(int[] arr) {

        boolean flag ;
        for (int i = 0; i < arr.length - 1; i++){
            flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            // 如果没有发生交换，说明数组已经有序，可以提前退出排序
            if (!flag){
                break;
            }

        }
    }
}
