public class Menu{

	private String menuID;
	private String Date;
	private String Western;
	private String Asian;
	private String Veggie;
	private String drink1;
	private String drink2;
	private String drink3;
	private String fruit1;
	private String fruit2;
	private String fruit3;
	

	public Menu(String menuID, String date, String western, String asian, String veggie, String drink1, String drink2,
			String drink3, String fruit1, String fruit2, String fruit3) {
		super();
		this.menuID = menuID;
		this.Date = date;
		this.Western = western;
		this.Asian = asian;
		this.Veggie = veggie;
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
		return Date;
	}

	public String getWestern() {
		return Western;
	}

	public void setWestern(String western) {
		Western = western;
	}

	public String getAsian() {
		return Asian;
	}

	public void setAsian(String asian) {
		Asian = asian;
	}

	public String getVeggie() {
		return Veggie;
	}

	public void setVeggie(String veggie) {
		Veggie = veggie;
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
		Date = date;
	}
	
	
}
