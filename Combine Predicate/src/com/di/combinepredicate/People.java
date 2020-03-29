package com.di.combinepredicate;

public class People {
	
	String name;
	String country;
	String city;

	public People(String name, String country, String city, int age) {
		super();
		this.name = name;
		this.country = country;
		this.city = city;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "Person [name=" + name + ", country=" + country + ", city=" + city + ", age=" + age + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
