package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortByStudentCity implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}
}

class SortByStudentMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getMarks(),o1.getMarks());
	}
}
class SortByStudentName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
class SortByStudentRollno implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getRoll(), o2.getRoll());
	}
	
}
public class program {
	
	
	public static void display(Student[] arr) {
		
		for(Student s : arr)
			System.out.println(s);
	}

	public static int menu(Scanner sc) {

		System.out.println("0.Exit");
		System.out.println("1. Sort by city");
		System.out.println("2. Sort by Marks");
		System.out.println("3. Sort by Name");
		System.out.println("4. Sort by Rollno");
		return sc.nextInt();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[5];
		arr[0] = new Student(1,"Mayur","Raigad",97);
		arr[1] = new Student(10,"Omkar","Satara",87);
		arr[2] = new Student(2,"Harshad","Nagpur",90);
		arr[3] = new Student(7,"Hritik","Pune",94);
		arr[4] = new Student(6,"Hari","Pune",70);

		int n;
		while ((n = menu(sc)) != 0) {
			switch (n) {
			case 1:
				SortByStudentCity s1 = new SortByStudentCity();
				Arrays.sort(arr,s1);
				display(arr);
				break;
			case 2:
				SortByStudentMarks s2 = new SortByStudentMarks();
				Arrays.sort(arr,s2);
				display(arr);
				break;
			case 3:

				SortByStudentName s3 = new SortByStudentName();
				Arrays.sort(arr,s3);
				display(arr);
				break;
			case 4:

				SortByStudentRollno s4 = new SortByStudentRollno();
				Arrays.sort(arr,s4);
				display(arr);
				break;

			default:
				break;
			}
		}
	}

}
