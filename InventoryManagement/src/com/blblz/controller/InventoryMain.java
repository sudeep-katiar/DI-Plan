package com.blblz.controller;

import com.blblz.service.InventoryService;
import com.blblz.serviceimpl.InventoryServiceImpl;

public class InventoryMain {
	
	public static void main(String[] args) throws Exception {
		InventoryService details = new InventoryServiceImpl();
		details.add();
		details.save();
//		details.print();
	}
}
