
public class Order {
	private String mealSet;
	private String drinkFruitsSet;
	private double price;
	private String orderID;
	
	public Order(String orderID, String mealSet, String drinkFruitsSet, double price) {
		this.orderID = orderID;
		this.mealSet = mealSet;
		this.drinkFruitsSet = drinkFruitsSet;
		this.price = price;
	}
	public String orderID() {
		return orderID;
	}

	public void orderID(String orderID) {
		this.orderID = orderID;
	}
	

	public String getMealSet() {
		return mealSet;
	}

	public void setMealSet(String mealSet) {
		this.mealSet = mealSet;
	}

	public String getDrinkFruitsSet() {
		return drinkFruitsSet;
	}

	public void setDrinkFruitsSet(String drinkFruitsSet) {
		this.drinkFruitsSet = drinkFruitsSet;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		// Write your codes here
		String orderInfo= "";
		orderInfo = String.format("%-15s %-30s %-10f", mealSet, drinkFruitsSet,price);
		
		return orderInfo;
	}
	

	
	
}
