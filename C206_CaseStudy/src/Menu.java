
public class Menu extends Item{

	private String menuID;
	private String weeklyDate;
	
	public Menu(String itemID, String foodType, String foodName, String drinks, String fruits, double price, String menuID, String weeklyDate) {
		super(itemID, foodType, foodName, drinks, fruits, price);
		this.menuID = menuID;
		this.weeklyDate = weeklyDate;
	}

	public String getMenuID() {
		return menuID;
	}

	public String getWeeklyDate() {
		return weeklyDate;
	}
	
	
	
	
}