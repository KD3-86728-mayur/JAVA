package assignment;

import java.util.Scanner;

public class Program {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = sc.nextLine();
		int length = s.length();
		if(length > 80) {
			throw new ExceptionLineTooLong("String is too long");
		}
		System.out.println(s);
	}

}
