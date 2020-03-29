package com.di.combinepredicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombinePredicate {
	
	public static void main(String[] args) {
		
		List<People> list=Stream.of(
				new People("Sudeep","India","Rourkela",23),
				new People("Rahul", "India", "Hydrabad", 20),
				new People("Farukh", "Dubai", "Abudhabi", 33),
				new People("Kunnal", "India", "Surat", 25),
				new People("John", "Us", "Houston", 41),
				new People("Chung chang cho", "China", "beaging", 20),
				new People("kevin", "Us", "Chicago", 25),
				new People("David", "Canada", "Toronto", 21),
				new People("Garg", "Dubai", "Abudhabi", 22)
				).collect(Collectors.toList());
		
		Predicate<People> usPerson=p-> p.getCountry().equals("Us");
		Predicate<People> rourkelaPerson=p->p.getCountry().equals("India");
		System.out.println("Peoples From Us");
		System.out.println(list.stream().filter(usPerson).collect(Collectors.toList()));
		System.out.println("Peoples From Rourkela-India");
		System.out.println(list.stream().filter(rourkelaPerson).collect(Collectors.toList()));
		
		System.out.println("People's who's Age between 21-25");
		List<People> agePerson=list.stream().filter((p)->p.getAge()>=21&&p.getAge()<=25).collect(Collectors.toList());
		agePerson.forEach(System.out::println);
		
	}

}
