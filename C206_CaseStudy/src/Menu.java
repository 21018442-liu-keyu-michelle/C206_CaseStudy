
public class Menu{
	private String foodName;
	private double price;
	private String drinkAndFruits;
	private String id;
	private String weeklyDate;
	private String dailyDate;
//test push
	public Menu(String id, String weeklyDate, String foodName, String drinkAndFruits, double price) {
		this.id = id;
		this.foodName = foodName;
		this.price = price;
		this.drinkAndFruits = drinkAndFruits;
		this.weeklyDate = weeklyDate;
	}

	public String getId() {
		return id;
	}

	public String getWeeklyDate() {
		return weeklyDate;
	}

	public String getDailyDate() {
		return dailyDate;
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
