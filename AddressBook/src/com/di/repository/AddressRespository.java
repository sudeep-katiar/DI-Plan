package com.di.repository;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressRespository {

	static JSONParser jsonParser = new JSONParser();
	static JSONObject jsonObject = new JSONObject();

	public static JSONObject readData() {
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("addressbook.json"));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}

	public static void writeDataNew(JSONObject jsonObject, File file) {
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeData(JSONObject jsonFinalObject) {
		try (FileWriter fileWriter = new FileWriter("addressbook.json")) {

			fileWriter.write(jsonFinalObject.toJSONString());

			System.out.println("Data is added to the file!!!\n\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject readDataNew(File file) {
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("addressbook.json"));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}

}
