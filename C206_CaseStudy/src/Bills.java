
public class Bills extends Order{

	private double totalAmount;


	public Bills(String orderID, String mealSet, String drinkFruitsSet, double price, double totalAmount) {
		super(orderID, mealSet, drinkFruitsSet, price);
		this.totalAmount = totalAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String toString() {
		// Write your codes here
		String billinfo = super.toString();
		
		billinfo += String.format("%-15f\n", totalAmount);
		
		return billinfo;
	}
	
}
