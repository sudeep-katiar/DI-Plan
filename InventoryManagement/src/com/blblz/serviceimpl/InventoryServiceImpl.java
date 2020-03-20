package com.blblz.serviceimpl;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.blblz.model.InventoryModel;
import com.blblz.service.InventoryService;

public class InventoryServiceImpl implements InventoryService {
	
	String path = "/home/user/Videos/InventoryManagement.json";
	static Scanner scn = new Scanner(System.in);
	static InventoryModel model = new InventoryModel();

	@SuppressWarnings("unchecked")
	@Override
	public void save() throws Exception {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name",model.getName());
		jsonObject.put("weight",model.getWeight());
		jsonObject.put("price",model.getPrice());
		
//		JSONArray array = new JSONArray();
//		array.add(jsonObject);
		
		FileReader fileReader = new FileReader(path);
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArray = (JSONArray) jsonParser.parse(fileReader);
		jsonArray.add(jsonObject);
		
		FileWriter fileWriter = new FileWriter(path);
		fileWriter.write(jsonArray.toJSONString());
		fileWriter.flush();
		fileWriter.close();
		
	}
	
	public void add() {
		
		System.out.println("enter item name");
		model.setName(scn.nextLine());
		
		System.out.println("enter item weight");
		 model.setWeight(scn.nextDouble());
		
		System.out.println("enter item price");
		model.setPrice(scn.nextDouble());
	}

	@Override
	public void print() throws Exception {
		
		FileReader fileReader = new FileReader(path);
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArray = (JSONArray) jsonParser.parse(fileReader);
		Iterator<?> iterator = jsonArray.iterator();
		while(iterator.hasNext()) {
			JSONObject j=(JSONObject) iterator.next();
			System.out.println(j.get("price"));
		}
	}
	
}
