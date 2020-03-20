package com.di.serviceimpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.di.model.Person;
import com.di.repository.AddressRespository;
import com.di.service.AddressService;
import com.di.util.Utility;

public class AddressServiceImplementation implements AddressService {
	
	JSONObject firstName = new JSONObject();
	JSONObject jsonFinalObject = new JSONObject();
	static JSONArray jsonArray = new JSONArray();
	File file;
	String path = "/home/objectorientedprograms/AddressBookProblem.json";

	@Override
	public void addAddressBook(String name) {
		file = new File(path + name + ".json");
		try (FileWriter fileWriter = new FileWriter(file)) {
			System.out.println("\n"+file.getName() + " Created Successfully\n");
			if (file.length() == 0) {
				// System.out.println("Coming inside the if block");
				String defaultValue = "{\n" + "  \"Address Book\" :{\n" + "  }\n" + "}";
				fileWriter.write(defaultValue);
				fileWriter.flush();
				fileWriter.close();
			}
			JSONObject temp = addUser(file);
			System.out.println("Result :" + temp);

			AddressRespository.writeDataNew(temp, file);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void deleteAddressBook(String name) {
		file = new File("JsonFile/" + name + ".json");
		if (file.exists()) {
			file.delete();
			System.out.println(name + " Deleted Successfully...\n");
		} else {
			System.out.println("The file you try to delete is not exist\n");
		}
	}

	@Override
	public File listOfFiles() {
		int i = 0;
		String select;
		Stream<Path> files;
		try {
			files = Files.walk(Paths.get(path));
			java.util.List<String> fileList = files.filter(Files::isRegularFile).map(path -> path.getFileName().toString())
					.collect(Collectors.toList());
			System.out.println("List of File");
			for (String f : fileList) {
				System.out.println(++i + "." + f);
			}
			System.out.println("Please select a File");
			select = Utility.inputString();
			String fileName = fileList.get(Integer.parseInt(select) - 1);
			String[] name = fileName.split("\\.");
			String fname = "";
			for (int j = 0; j < name.length; j++) {
				fname = name[0];
			}
			file = new File(path + fname + ".json");

		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void store(Person person) {
		JSONObject json = AddressRespository.readData();
		System.out.println("From file :" + json);
		json = (JSONObject) json.get("Address Book");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("FirstName", person.getFirstName());
		jsonObject.put("LastName", person.getLastName());
		jsonObject.put("City", person.getCity());
		jsonObject.put("State", person.getState());
		jsonObject.put("Address", person.getAddress());
		jsonObject.put("Zip", person.getZip());
		jsonObject.put("Mobile", person.getPhonenumber());

		jsonArray.add(jsonObject);

		json.put(person.getFirstName(), jsonArray);

		jsonFinalObject.put("Address Book", json);

		System.out.println(jsonFinalObject);

		AddressRespository.writeData(jsonFinalObject);
	}

	public static JSONObject addUser(File file) {
		String firstName, lastName, address, city, state;
		String zip;
		String mobile;
		Person person = new Person();
		System.out.println("Enter first Name :");
		firstName = Utility.getString(false);

		System.out.println("Enter Last Name :");
		lastName = Utility.getString(false);

		System.out.println("Enter Address :");
		address = Utility.getString(false);

		System.out.println("Enter city Name :");
		city = Utility.getString(false);

		System.out.println("Enter State Name :");
		state = Utility.getString(false);

		System.out.println("Enter Zip Code:");
		zip = Utility.inputString();
		if (Utility.stringChecker(zip)) {
			person.setZip(Integer.parseInt(zip));
		}

		System.out.println("Enter 10 digit Phone Number :");
		mobile = Utility.inputString();
		if (Utility.stringChecker(zip)) {
			person.setPhonenumber(Long.parseLong(mobile));
		}

		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setCity(city);
		person.setAddress(address);
		person.setState(state);
		return storeFile(person, file);
	}
	
	@SuppressWarnings("unchecked")
	public static JSONObject storeFile(Person person, File file2) {

		JSONObject baseJson = AddressRespository.readDataNew(file2);
		JSONObject json = (JSONObject) baseJson.get("Address Book");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("FirstName", person.getFirstName());
		jsonObject.put("LastName", person.getLastName());
		jsonObject.put("City", person.getCity());
		jsonObject.put("State", person.getState());
		jsonObject.put("Address", person.getAddress());
		jsonObject.put("Zip", person.getZip());
		jsonObject.put("Mobile", person.getPhonenumber());

		jsonArray.add(jsonObject);

		json.put(person.getFirstName(), jsonArray);
		System.out.println(baseJson);
		return baseJson;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void edit(File file, String name) {
		JSONObject json = new JSONObject();
		JSONObject temp = new JSONObject();
		jsonFinalObject = AddressRespository.readDataNew(file);
		json = (JSONObject) jsonFinalObject.get("Address Book");
		jsonArray = (JSONArray) json.get(name);

		System.out.println("Please select what you want to update ");
		Iterator<?> iterator = jsonArray.iterator();

		while (iterator.hasNext()) {
			JSONObject object = (JSONObject) iterator.next();

			object.forEach((k, v) -> {

				System.out.println(k + " " + v);
				System.out.println("Do u want to update " + k + "\nenter Y for yes otherwise enter N");
				String updatedvalue = Utility.inputString().toUpperCase();
				if (!k.equals("FirstName")) {
					if (updatedvalue.equals("Y")) {
						System.out.println("Please enter updated value for " + k);
						updatedvalue = Utility.inputString();
						v = updatedvalue;
					}
					temp.put(k, v);
				} else {
					temp.put(k, v);
					System.out.println("Sorry you can't change your First Name");
				}
			});
			jsonArray.remove(object);
			jsonArray.add(temp);

		}
		System.out.println("Updated value " + jsonFinalObject.toJSONString());
		AddressRespository.writeDataNew(jsonFinalObject, file);

	}

	@Override
	public void delete(File file, String name) {
		JSONObject json = new JSONObject();
		jsonFinalObject = AddressRespository.readDataNew(file);
		json = (JSONObject) jsonFinalObject.get("Address Book");
		json.remove(name);

		AddressRespository.writeDataNew(jsonFinalObject, file);
	}

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject search(File file, String name) {
		JSONObject json = new JSONObject();
		jsonFinalObject = AddressRespository.readDataNew(file);
		json = (JSONObject) jsonFinalObject.get("Address Book");

		jsonArray = (JSONArray) json.get(name);

		jsonArray.forEach(person -> AddressServiceImplementation.displayPersonDetails((JSONObject) person));
		return json;
	}

	private static void displayPersonDetails(JSONObject person) {
		System.out.println("----------Person Details----------\n");
		System.out.println("Name :" + person.get("FirstName") + " " + person.get("LastName"));
		System.out.println("\nAddress :" + person.get("Address"));
		System.out.println("\nCity :" + person.get("City"));
		System.out.println("\nState :" + person.get("State"));
		System.out.println("\nZip :" + person.get("Zip"));
		System.out.println("\nMobile :" + person.get("Mobile"));
	}

}
