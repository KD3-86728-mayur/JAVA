package question1;

public class Invoice {

	String partNumber;
	String partDescription;
	int quantity;
	double price;
	
	public Invoice() {	
	}

	public  Invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		
		if(quantity < 0)quantity = 0;
		else this.quantity = quantity;
		
		if(price < 0) price = 0.0;
		else this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0)quantity = 0;
		else this.quantity = quantity;		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) price = 0.0;
		else this.price = price;
	}
	
	public double invAmount() {
		
		return price*quantity;
	}	
}
