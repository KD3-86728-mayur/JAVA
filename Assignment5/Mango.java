package com.app.fruit;

import java.util.Scanner;

public class Mango extends Fruit {

	Mango(){
		
	}

	Mango(String color, double weight, String name, boolean isFreash){
		super(color,weight,name,isFreash);
	}
	
	@Override
	String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}

	
	@Override
	void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}

	
}
