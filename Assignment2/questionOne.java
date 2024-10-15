package assignment2;

import java.util.Scanner;

public class questionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		String binary = Integer.toBinaryString(n);
		String octal = Integer.toOctalString(n);
		String hexa = Integer.toHexString(n);
		
		System.out.println("Binary : "+binary);
		System.out.println("octal : "+octal);
		System.out.println("hexa : "+hexa);
	}

}
