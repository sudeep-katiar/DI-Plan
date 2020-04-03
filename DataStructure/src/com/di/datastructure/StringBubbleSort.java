package com.di.datastructure;

public class StringBubbleSort {
    public String[] bubbleSort(String[] list) {
        for (int count = 0; count < list.length; count++) {
            for (int count2 = count + 1; count2 < list.length; count2++) {
                // comparing strings
                if (list[count2].compareTo(list[count]) < 0) {
                    String temp = list[count];
                    list[count] = list[count2];
                    list[count2] = temp;
                }
            }
        }
        return list;
    }
}