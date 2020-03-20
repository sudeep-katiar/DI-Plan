package com.di.exp1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		List<Person> personsList = Arrays.asList(new Person(150, "aSudeepa", "Khatua"),
				new Person(15, "dRVGrvg", "Khbdyhnd"), new Person(155555, "sSfhnghfnfudeepa", "Khnmgfbnghfnatua"),
				new Person(22215, "kSungfngfngfdeepa", "Khnfgnjgfatua"),
				new Person(697815, "qSudemnghfmngfnepa", "Khafmnfnghftua"));

		// display all list

		// personsList.forEach(System.out::println);

		//personsList.stream().filter(p -> p.getAge() > 150).forEach(System.out::println);

		Collections.sort(personsList, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		personsList.forEach(System.out::println);

		// display all person name starts with s
	}

}
