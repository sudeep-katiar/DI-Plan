package com.di.datastructure;

/**
 * program for Bubble sort using the integer sort, string and generics.
 * **/
public class BubbleSort {
    public static void main(String[] args) {

        int intArray[] = {3,5,2,4,1};
        String stringArray[] = {"sudeep","ritesh","durga","rupesh"};
        String genericArray[] = {"x","r","z","c","a"};

        GenericBubbleSort<String> genericBubbleSort = new GenericBubbleSort<>();
        IntegerBubbleSort integerBubbleSort = new IntegerBubbleSort();
        StringBubbleSort stringBubbleSort = new StringBubbleSort();

        genericArray = genericBubbleSort.bubbleSort(genericArray,genericArray.length);
        stringArray = stringBubbleSort.bubbleSort(stringArray);
        intArray = integerBubbleSort.bubbleSort(intArray);

        System.out.println("Generic Array After Sorting");

        for (String string:genericArray){
            System.out.println(string);
        }

        System.out.println("int Array After Sorting");

        for (int number:intArray){
            System.out.println(number);
        }

        System.out.println("String Array After Sorting");

        for (String string:stringArray){
            System.out.println(string);
        }
    }
}
