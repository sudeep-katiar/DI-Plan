package com.di.datastructure;

public class IntegerBubbleSort {

    public int[] bubbleSort(int[] list) {

        int size = list.length;
        int temp = 0;

        for (int count = 0; count < size; count++) {

            for (int count2 = 1; count2 < (size - count); count2++) {

                if (list[count2 - 1] > list[count2]) {
                    temp = list[count2 - 1];
                    list[count2 - 1] = list[count2];
                    list[count2] = temp;
                }
            }
        }
        return list;
    }

}
