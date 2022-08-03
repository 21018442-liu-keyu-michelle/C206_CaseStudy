
public class Item {
	private String itemID;
	private String foodType;
	private String foodName ;
	private String drinks;
	private String fruits;
	private double price;
	
	public Item(String itemID, String foodType, String foodName, String drinks, String fruits, double price) {
		this.itemID = itemID;
		this.foodType = foodType;
		this.foodName = foodName;
		this.drinks = drinks;
		this.fruits = fruits;
		this.price = price;
	}

	public String getItemID() {
		return itemID;
	}

	public String getFoodType() {
		return foodType;
	}

	public String getFoodName() {
		return foodName;
	}

	public String getDrinks() {
		return drinks;
	}

	public String getFruits() {
		return fruits;
	}

	public double getPrice() {
		return price;
	}
	
	
	
	
	
	
}
