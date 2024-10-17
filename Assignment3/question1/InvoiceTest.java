package question1;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice in = new Invoice("1","ABC",5,1000);	
		System.out.println("Invoice amount is : "+in.invAmount());
	}
}
