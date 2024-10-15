package assignment2;

import java.util.Scanner;

public class questionTwo {
	
	static void print() {
		System.out.println("****MENU*****");
		System.out.println("1: Dosa ");
		System.out.println("2: Samosa");
		System.out.println("3: Idli");
		System.out.println("4: Generate bill");
		System.out.println("Enter any option");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		print();
		
		int n;
		double bill = 0;
		while ((n = sc.nextInt()) != 0) {
			switch (n) {
			case 1:
				System.out.println("Enter quantity :");
				int q = sc.nextInt();
				bill += 10*q;
				print();
				break;
			case 2:
				System.out.println("Enter quantity :");
				int q2 = sc.nextInt();
				bill += 15*q2;
				print();
				break;
			case 3:
				System.out.println("Enter quantity :");
				int q3 = sc.nextInt();
				bill += 30*q3;
				print();
				break;
			case 4:
				System.out.println("Total bill is : "+bill);
				return;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}
