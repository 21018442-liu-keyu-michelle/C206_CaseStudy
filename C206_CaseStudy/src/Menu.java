public class Menu{

	private String menuID;
	private String date;
	private String western;
	private String asian;
	private String veggie;
	private String drink1;
	private String drink2;
	private String drink3;
	private String fruit1;
	private String fruit2;
	private String fruit3;
	

	public Menu(String menuID, String date, String western, String asian, String veggie, String drink1, String drink2,
			String drink3, String fruit1, String fruit2, String fruit3) {
		this.menuID = menuID;
		this.date = date;
		this.western = western;
		this.asian = asian;
		this.veggie = veggie;
		this.drink1 = drink1;
		this.drink2 = drink2;
		this.drink3 = drink3;
		this.fruit1 = fruit1;
		this.fruit2 = fruit2;
		this.fruit3 = fruit3;
	}

	public String getMenuID() {
		return menuID;
	}

	public String getDate() {
		return date;
	}

	public String getWestern() {
		return western;
	}

	public void setWestern(String western) {
		this.western = western;
	}

	public String getAsian() {
		return asian;
	}

	public void setAsian(String asian) {
		this.asian = asian;
	}

	public String getVeggie() {
		return veggie;
	}

	public void setVeggie(String veggie) {
		this.veggie = veggie;
	}

	public String getDrink1() {
		return drink1;
	}

	public void setDrink1(String drink1) {
		this.drink1 = drink1;
	}

	public String getDrink2() {
		return drink2;
	}

	public void setDrink2(String drink2) {
		this.drink2 = drink2;
	}

	public String getDrink3() {
		return drink3;
	}

	public void setDrink3(String drink3) {
		this.drink3 = drink3;
	}

	public String getFruit1() {
		return fruit1;
	}

	public void setFruit1(String fruit1) {
		this.fruit1 = fruit1;
	}

	public String getFruit2() {
		return fruit2;
	}

	public void setFruit2(String fruit2) {
		this.fruit2 = fruit2;
	}

	public String getFruit3() {
		return fruit3;
	}

	public void setFruit3(String fruit3) {
		this.fruit3 = fruit3;
	}

	public void setMenuID(String menuID) {
		this.menuID = menuID;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public String toString1() {
		// Write your codes here
		String menuInfo= "";

		menuInfo += String.format("%-10s %-15s %-20s %-25s %-30s %-35s %-40s %-45s %-50s %-55s %-60s\n", menuID,date, western, asian, veggie, drink1, drink2,
				drink3,fruit1,fruit2,fruit3);
		//orderInfo += String.format("%-15s %-30s %-10f", mealSet, drinkFruitsSet,price);
		
		return menuInfo;
	}
	
	
}
