package question2;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setSalary(78958);
		e2.setSalary(-65000);
		
		System.out.println("Salary of e1 if enter in positive :"+e1.salary);
		System.out.println("Salary if e2 if enter in  negative :"+e2.salary);
		
		double s1 = e1.getSalary() + e1.getSalary()*0.1;
		double s2 = e2.getSalary() + e2.getSalary()*0.1;
	
		e1.setSalary(s1);
		e2.setSalary(s2);
		
		System.out.println("Salary of e1 after 10% increment : "+e1.salary);
		System.out.println("Salary of e2 after 10% increment : "+e2.salary);	
	}
}
