package com.app.fruit;

import java.util.Scanner;

public class Apple extends Fruit {

	Apple(){
		
	}
	Apple(String color, double weight, String name, boolean isFreash){
		super(color,weight,name,isFreash);
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
	@Override
	String taste() {
		// TODO Auto-generated method stub
		return "sweet n sour";
	}

}
