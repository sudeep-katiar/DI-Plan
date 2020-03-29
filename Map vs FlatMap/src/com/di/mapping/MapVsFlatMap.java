package com.di.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	
	public static void main(String[] args) {
		
		/*****************************************************************************
		 * The map() method produces one output value for each input value in the
		 * stream. So if there are n elements in the stream, map() operation will
		 * produce a stream of n output elements.
		 ******************************************************************************/

		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

		List<Integer> listOfIntegers = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());

		System.out.println("Map:"+listOfIntegers);
		
		/********************************************************************************
		 * flatMap() is two step process i.e. map() + Flattening. It helps in converting
		 * Collection<Collection<T>> to Collection<T>.
		 *********************************************************************************/

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

		List<Integer> listOfAllIntegers = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

		System.out.println("FlatMap: "+listOfAllIntegers);
		
	}

}
