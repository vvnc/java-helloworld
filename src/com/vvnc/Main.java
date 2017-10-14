package com.vvnc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {45, 23, 1, 0, 3, 43, 7};
        System.out.format("Input data: %s\n", Arrays.toString(data));
        Sort.MergeSort(data);
        System.out.format("Sorted data: %s\n", Arrays.toString(data));
    }
}
