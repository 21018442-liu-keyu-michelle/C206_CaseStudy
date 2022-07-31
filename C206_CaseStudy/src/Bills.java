
public class Bills extends Order{

	private double totalAmount;

	public Bills(String mealSet, String drinkFruitsSet, double price, double totalAmount) {
		super(mealSet, drinkFruitsSet, price);
		this.totalAmount = totalAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
