public class Menu extends Item{
	private String menuID;
	private String date;
	
	public Menu(String itemID, String category, String foodName, double price, String menuID, String date) {
		super(itemID, foodName, category, price);
		this.menuID = menuID;
		this.date = date;
	}

	public String getMenuID() {
		return menuID;
	}

	public String getDate() {
		return date;
	}
	
}
