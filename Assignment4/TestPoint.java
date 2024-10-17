package com.example.geometry;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		System.out.println("Enter point one");
		p1.accept();
		System.out.println("Enter point two");
		p2.accept();
		
	
		System.out.println("Check equal or not : "+p1.isEqual(p2));
		
		p1.check(p2);
		
		

	}

}
