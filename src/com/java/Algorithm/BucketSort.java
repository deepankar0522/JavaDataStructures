package com.java.Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {
        int[] intArray = {54, 23, 12, 54, 67, 9, 27};
        bucketSort(intArray);

        for (int element : intArray) {
            System.out.println(element);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }
        for(List bucket:buckets){
            Collections.sort(bucket);
        }

        int j = 0;
        for(int i=0; i< buckets.length;i++){
            for(int value:buckets[i]){
                input[j++]=value;
            }
        }
    }

    public static int hash(int value){
        return value/ (int) 10;
    }
}
