package com.example.geometry;

import java.util.Scanner;

public class Point2D {
	int x;
	int y;
		
	public Point2D() {
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("X and Y coordinates : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	public String getDetails() {
		String detail = "X : "+x+", Y : "+y;
		return detail;
	}
	
	public boolean isEqual(Point2D p2) {
		if(this.x == p2.x && this.y == p2.y) {
			return true;
		}
		return false;
	}
	
	public void calculateDistance(Point2D p2) {
		double temp = Math.pow((p2.x - this.x),2) + Math.pow((p2.y - this.y), 2); 
		double ans = Math.sqrt(temp);
		System.out.println("Distance is : "+ans);
		
	}
	
	public void getAllDetails(Point2D p2) {
		String point1 = "X1 : "+x+", Y1 : "+y;
		String point2 = "X2 : "+p2.x+", Y2 : "+p2.y;
		System.out.println(point1);
		System.out.println(point2);
	}
	
	public void check(Point2D p2) {
		boolean flag = isEqual(p2);
		if(flag) {
			System.out.println("points are equal");
			getAllDetails(p2);
		}else {
			calculateDistance(p2);
		}
	}
	
}
