package com.di.basicprograms;

import java.util.HashMap;
import java.util.Map;

/*
 * Java Program to iterate HashMap using While and advance for loop.
 *
 * @author  :  Sudeep Kumar Katiar
 *  @version :  1.0
 *  @since   :  27-03-2020
 */
public class HashMapIterator {

    public static void main(String[] args) {

        // HashMap iteration with forEach()
        Map<String, Integer> items = new HashMap<>();
        items.put("coins", 5);
        items.put("pens", 2);
        items.put("chairs", 7);

        items.forEach((k, v) -> {
            System.out.format("key: %s, value: %d%n", k, v);
        });

        // HashMap iteration with enhanced for loop
        for (Map.Entry<String, Integer> pair: items.entrySet()) {
            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
        }
    }
}
