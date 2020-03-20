package com.blblz.model;

public class InventoryModel {
	private String name;
	private double weight;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public InventoryModel(String name, double weight, double price) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	@Override
	public String toString() {
		return "InventoryModel [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}

public InventoryModel() {
	super();
}

}
