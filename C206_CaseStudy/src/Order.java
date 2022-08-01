
public class Order {
	private String mealSet;
	private String drinkFruitsSet;
	private double price;
	
	public Order(String mealSet, String drinkFruitsSet, double price) {
		this.mealSet = mealSet;
		this.drinkFruitsSet = drinkFruitsSet;
		this.price = price;
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
		orderInfo += String.format("%-10s %-30s %-10f\n", mealSet, drinkFruitsSet,price);
		
		return orderInfo;
	}

	
	
}
