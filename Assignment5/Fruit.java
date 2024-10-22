package com.app.fruit;

import java.util.Scanner;

public abstract class Fruit {
	
	String color;
	double weight;
	String name;
	boolean isFreash;
	
	
	
	public Fruit() {
	}
	
	public Fruit(String color, double weight, String name, boolean isFreash) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFreash = isFreash;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFreash() {
		return isFreash;
	}

	public void setFreash(boolean isFreash) {
		this.isFreash = isFreash;
	}

	void accept(Scanner sc) {
		System.out.println("Enter color : ");
		color = sc.next();
		System.out.println("Enter Weight : ");
		weight = sc.nextDouble();
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("is Fresh or not : ");
		isFreash = sc.nextBoolean();
	}
	
	void display() {
		System.out.print("Color is : "+color);
		System.out.print("Weight is : "+weight);
		System.out.print("Name is : "+name);
		System.out.print("Fresh status : "+isFreash);
	}
	
	abstract String taste();
	
}
