package com.pagoda;

import com.alibaba.fastjson.JSONArray;

/**
 * 选择排序
 *      选出最小的值 在按顺序排序
 * Created by myijoes on 2019/12/23.
 *
 * @author wanqiao
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 10, 15, 9, 7, 20, 23, 18, 8, 27};
        SelectionSort.selectionSort(arr);
    }

    /**
     *
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mixIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[mixIndex] > arr[j]) {
                    mixIndex = j;
                }
            }
            int mixValue = arr[mixIndex];
            arr[mixIndex] = arr[i];
            arr[i] = mixValue;

        }
        System.out.println("结果 : " + JSONArray.toJSONString(arr));
    }
}
