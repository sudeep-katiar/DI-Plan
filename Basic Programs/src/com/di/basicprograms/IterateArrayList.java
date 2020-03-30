package com.di.basicprograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Java Program to iterate ArrayList using for-loop, while-loop, advance for-loop and Lambda
 *
 * @author  :  Sudeep Kumar Katiar
 *  @version :  1.0
 *  @since   :  27-03-2020
 */

public class IterateArrayList {

    public static void main(String[] args)
    {
        // initializing ArrayList
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // For Loop for iterating ArrayList
        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
        System.out.println();

        // For Each Loop for iterating ArrayList
        for (Integer i : numbers)
            System.out.print(i + " ");
        System.out.println();

        // Looping ArrayList using Iterator
        Iterator it = numbers.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        //lambda
        numbers.forEach(number->System.out.print(number));
    }
}
