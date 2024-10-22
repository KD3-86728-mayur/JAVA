package question2;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		System.out.println(reverse(s));
	}

	private static String reverse(String s) {
		
		StringBuffer sb = new StringBuffer(s);
	
		int l = 0, h = sb.length()-1;	
		while(l <= h) {
			char temp = sb.charAt(l);
			char temp2 = sb.charAt(h);
			sb.replace(h,h+1,String.valueOf(temp));
			sb.replace(l, l+1,String.valueOf(temp2));
			l++;
			h--;
			
		}
		return sb+"";
	}

}
