package com.di.datastructure;

public class GenericBubbleSort<T> {
    public  <T extends Comparable<T>> T[] bubbleSort (T[] list, int size) {
        int swap = 1, out, in;
        T temp;

        // swapOccurred helps to stop iterating if the array gets sorted before outCounter out reaches to size
        for (out = size - 1; out > 0 && swap == 1; out--) {
            swap = 0;

            for (in = 0; in < out; in++) {

                if (list[in].compareTo(list[in + 1]) > 0) {

                    temp = list[in];
                    list[in] = list[in + 1];
                    list[in + 1] = temp;
                    swap = 1;
                }
            }
        }
        return list;
    }
}