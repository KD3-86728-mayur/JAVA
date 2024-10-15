package assignment1;

import java.util.Scanner;

public class assignmentOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	
		double ans = 0;
		if(sc.hasNextDouble() && !sc.hasNextInt()) {
			double a = sc.nextDouble();
			if(sc.hasNextDouble() && !sc.hasNextInt()) {
				double b = sc.nextDouble();
				ans = (a + b)/2;
				System.out.println("Average is : "+ ans);
			}else {
				System.out.println(" second is Not double value");
			}
		}else {
			System.out.println("Not double value");
		}
	}
}
