package com.pagoda;

import com.alibaba.fastjson.JSONArray;

/**
 * 归并排序  O(n log n）  代价是需要额外的内存空间  采用分治法
 *
 * 对数组进行拆分 左右两个子集  对子集一直递归拆分  对子集合并  成一个  通过左右两个指针 和存放指针来放到另外一个内存中
 *
 * Created by myijoes on 2019/12/27.
 *
 * @author wanqiao
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 10, 15, 9, 7, 20, 23, 18, 8, 27};
        MergeSort.mergeSort(arr, 0, arr.length-1);
        System.out.println("排好序的数组：" + JSONArray.toJSONString(arr));
    }

    public static void mergeSort(int [] a,int start,int end){
        if(start<end){//当子序列中只有一个元素时结束递归
            int mid=(start+end)/2;//划分子序列
            mergeSort(a, start, mid);//对左侧子序列进行递归排序
            mergeSort(a, mid+1, end);//对右侧子序列进行递归排序
            merge(a, start, mid, end);//合并
        }
    }

    //两路归并算法，两个排好序的子序列合并为一个子序列
    public static void merge(int []a,int left,int mid,int right){
        int []tmp=new int[a.length];//辅助数组
        int p1=left,p2=mid+1,k=left;//p1、p2是检测指针，k是存放指针

        while(p1<=mid && p2<=right){
            if(a[p1]<=a[p2])
                tmp[k++]=a[p1++];
            else
                tmp[k++]=a[p2++];
        }

        while(p1<=mid) tmp[k++]=a[p1++];//如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while(p2<=right) tmp[k++]=a[p2++];//同上

        //复制回原素组
        for (int i = left; i <=right; i++)
            a[i]=tmp[i];
    }

}
