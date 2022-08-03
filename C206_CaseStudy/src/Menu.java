
public class Menu{
	private String foodName;
	private double price;
	private String drinkAndFruits;

	public Menu(String foodName, String drinkAndFruits, double price) {
		this.foodName = foodName;
		this.price = price;
		this.drinkAndFruits = drinkAndFruits;
	}


	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDrinkAndFruits() {
		return drinkAndFruits;
	}

	public void setDrink(String drinkAndFruits) {
		this.drinkAndFruits = drinkAndFruits;
	}
}
