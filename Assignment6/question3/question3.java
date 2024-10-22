package question3;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(str +" = " +isPalindrome(str));
	}
	
	private static boolean isPalindrome(String s) {
		
		int l = 0, h = s.length()-1;
		while(l<=h) {
			if(s.charAt(l) != s.charAt(h)) {
				return false;
			}
			l++;
			h--;
		}
		
		return true;
	}
}
