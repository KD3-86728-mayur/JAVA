package com.app.fruit;

import java.util.Scanner;

public class Orange extends Fruit{

	Orange(){
		
	}
	
	Orange(String color, double weight, String name, boolean isFreash){
		super(color,weight,name,isFreash);
	}
	
	@Override
	String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}

	@Override
	void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
	}


	
}
