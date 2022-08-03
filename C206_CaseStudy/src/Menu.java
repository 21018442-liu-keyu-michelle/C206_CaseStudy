public class Menu{
	private String foodName;
	private double foodPrice;
	private String drinkAndFruits;
	private double drinkPrice;

	public Menu(String foodName, double foodprice) {
		this.foodName = foodName;
		this.foodPrice = foodprice;
	}

	public Menu(double drinkPrice, String drinkAndFruits) {
		this.drinkPrice = drinkPrice;
		this.drinkAndFruits = drinkAndFruits;
	}


	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getPrice() {
		return foodPrice;
	}

	public void setPrice(double price) {
		this.foodPrice = price;
	}

	public String getDrinkAndFruits() {
		return drinkAndFruits;
	}

	public void setDrink(String drinkAndFruits) {
		this.drinkAndFruits = drinkAndFruits;
	}
	public String toString() {
		// Write your codes here
		String menuInfo= "";
		menuInfo += String.format("%-10s %-30s\n", foodName,foodPrice);
		menuInfo += String.format("%-10f %-20f\n",drinkAndFruits,drinkPrice);
		return menuInfo;
	}


		
}

