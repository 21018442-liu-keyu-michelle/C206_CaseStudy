
public class Item {
	 private String itemID;
	 private String foodName ;
	 private String category;
	 private double price; 
	
	public Item(String itemID, String category,String foodName, double price) {
		this.itemID = itemID;
		this.foodName = foodName;
		this.category = category;
		this.price = price;
	}

	public String getItemID() {
		return itemID;
	}


	public String getFoodName() {
		return foodName;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}
	
	public String toString() {
		// Write your codes here
		String itemInfo= "";
		itemInfo = String.format("%-10s %-15s %-30s %-10.2f\n", itemID, category, foodName, price);
		
		return itemInfo;
	}
	
	
	
	
	
}
