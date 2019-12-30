package com.pagoda;

import com.alibaba.fastjson.JSONArray;

/**
 * 插入排序
 *
 * 局部有序 待插入的和局部有序的一个一个比较
 *
 * Created by myijoes on 2019/12/26.
 *
 * @author wanqiao
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 10, 15, 9, 7, 20, 23, 18, 8, 27};
        InsertionSort.insertionSort(arr);
        InsertionSort.insertionSort1(arr);
    }

    /**
     * 这个也是插入 但是最后面的比较为无效比较 可以优化
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            for (int j = i; j >= 1; j--)
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
        System.out.println("结果 : " + JSONArray.toJSONString(arr));
    }

    /**
     * 比较合适的插入排序  后面的无效比较直接过滤掉
     *
     * 插入排序 在有序的时候会比较快
     */
    public static void insertionSort1(int[] array) {
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        System.out.println("结果 : " + JSONArray.toJSONString(array));
    }


}
