package com.di.service;

import java.io.File;

import org.json.simple.JSONObject;

import com.di.model.Person;

public interface AddressService {

	void addAddressBook(String name);

	void deleteAddressBook(String name);

	File listOfFiles();

	void store(Person person);

	void edit(File file, String name);

	void delete(File file, String name);

	JSONObject search(File file, String name);

}
