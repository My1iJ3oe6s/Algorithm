package com.pagoda;

import com.alibaba.fastjson.JSONArray;

/**
 * 冒泡排序
 * 从左到右 递增一个一个比较 大的在右边 直到最大的在右边
 *
 * 排序的是始终有序的
 *
 * Created by myijoes on 2019/12/23.
 *
 * @author wanqiao
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 10, 15, 9, 7, 20, 23, 18, 8, 27};
        BubbleSort.bubbleSort1(arr);
        BubbleSort.bubbleSort2(arr);
    }

    /**
     *
     */
    public static void bubbleSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
        System.out.println("结果 : " + JSONArray.toJSONString(arr));
    }

    /**
     *
     */
    public static void bubbleSort2(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int change = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = change;
                }
            }
        }
        System.out.println("结果 : " + JSONArray.toJSONString(arr));
    }

}
