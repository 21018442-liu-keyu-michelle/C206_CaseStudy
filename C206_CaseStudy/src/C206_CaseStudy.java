
import java.util.ArrayList;

public class C206_CaseStudy{
	
	public static void main(String[] args) {
		
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Order> orderList = new ArrayList<Order>();
		ArrayList<Bills> billList = new ArrayList<Bills>();
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		ArrayList<Item> itemList = new ArrayList<Item>();
	
		parentList.add(new Parent(1234, 7890, "Jeanlim12", 91459270));
		studentList.add(new Student(3680, 1359, "Matthewang90", "matthewang90@bedok.edu.sg"));
		
		orderList.add(new Order("W101","Western food", "Apple and Juice", 4.50));
		orderList.add(new Order("A101","Asian food", "Grapes and Green Tea", 4.00));
		orderList.add(new Order("V101","Vegeterian food", "Orange and Soy Milk", 3.50));
		
		
		billList.add(new Bills("W101","Western food", "Apple and Juice", 3.50,(3.50*20)));
		billList.add(new Bills("A101","Asian food", "Grapes and Green Tea", 3.00, (3*20)));
		billList.add(new Bills("V101","Vegeterian food", "Orange and Soy Milk", 2.50, (2.50*20)));
		
		itemList.add(new Item("127", "Western food", "Chicken Chop" , 4.50));
		itemList.add(new Item("125", "Drink", "Apple Juice" , 1.50));
		itemList.add(new Item("126", "Fruit", "Banana" , 1.00));
		
		menuList.add(new Menu("127", "01-08-2022", "Spaghetti", "Wanton Mee", "Vegetarian Bee Hoon", "Green tea",
				"Orange Juice", "Watermelon Slice", "Apple Slice"));
		menuList.add(new Menu("128", "02-08-2022", "Fish And Chips", "Dumpling Soup", "Veggie Fried Rice",
				"Orange Juice", "Apple Juice", "Watermelon", "Honey Dew"));
		menuList.add(new Menu("129", "03-08-2022", "Chicken Cutlet", "Ramen", "Stuffed Baby Eggplant",
				"Blueberry Juice", "Coke", "Pear", "Papaya"));
		menuList.add(new Menu("130", "04-08-2022", "Chicken Chop", "Sushi", "Vegetable Soup", "Ice Lemon Tea",
				"Sugar Cane Juice", "Mango", "Blueberry"));
		menuList.add(new Menu("131", "05-08-2022", "Steak", "Chicken Rice", "Vegetarian Bee Hoon", "Green tea",
				"Orange Juice", "Watermelon Slice", "Apple Slice"));
		menuList.add(new Menu("132", "06-08-2022", "Barbecue Ribs", "Satay", "Vegetarian Curry Noddle", "Sprite",
				"7 Up", "Strawberries", "Avocado"));
		menuList.add(new Menu("133", "07-08-2022", "Pork Loin", "Laksa", "Economy Rice", "Minute Maid", "100 Plus",
				"Blackberry", "Raspberry"));
	}
	{
		int option = 0;

		while (option != 6) {
			menu();
			option = Helper.readInt("Enter an option > ");

<<<<<<< HEAD
			if (option == 1) {
				ViewAllOrderBills(billList);
				//subMenuUserAccount();	
				subMenuUserAccount();
=======
			if (option == 1) {
				retreiveAllLunchBoxOrder(null);
				//subMenuUserAccount();
>>>>>>> branch 'master' of https://github.com/21018442-liu-keyu-michelle/C206_CaseStudy.git

			} else if (option == 2) {
				subMenuItem();
				
			} else if (option == 3) {
				subMenu();
				
			} else if (option == 4) {
				subMenuLunchBoxOrders();
				
			} else if (option == 5) {
				subMenuOrderBills();
				
			} else if (option == 6) {
				System.out.println("Thank you for using this programme!!");
					
			} else {
				System.out.println("Invalid Option!!");
				
			}
			
			
		}

	}
	//================================= Menu Method (Done by: Fikri) =================================
	public static void menu() {
		C206_CaseStudy.setHeader("LUNCHBOXORDER APP");
		System.out.println("1. Manage user account");
		System.out.println("2. Manage MenuBank");
		System.out.println("3. Manage monthly menu");
		System.out.println("4. Manage LunchBox order");
		System.out.println("5. Manage OrderBills");
		System.out.println("6. Quit");
		Helper.line(80, "-");
		
	}
	//================================= Sub-Menu Method (Done by: Fikri) =================================
	public static void subMenuUserAccount() {
		C206_CaseStudy.setHeader("MANAGE USER ACCOUNT");
		System.out.println("1. Add user account");
		System.out.println("2. View user account");
		System.out.println("3. Delete user account");
		Helper.line(80, "-");
		
	}
	public static void subMenuItem() {
		C206_CaseStudy.setHeader("MANAGE MENUBANK");
		System.out.println("1. Add menu item");
		System.out.println("2. View menu items");
		System.out.println("3. Loan item");
		Helper.line(80, "-");
		
	}
	public static void subMenu() {
		C206_CaseStudy.setHeader("MANAGE MONTHLY MENU");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		Helper.line(80, "-");
		
	}
	public static void subMenuLunchBoxOrders() {
		C206_CaseStudy.setHeader("MANAGE LUNCHBOXORDER");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		Helper.line(80, "-");
		
	}
	public static void subMenuOrderBills() {
		C206_CaseStudy.setHeader("MANAGE ORDERBILLS");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		Helper.line(80, "-");
		
	}
	//================================= SetHeader Method (Done by: Fikri) =================================
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	//================================= MenuItem Method (Done by: Michelle) =================================
	public static String retrieveAllMenuItems(ArrayList<Item> itemList) {
		String output = "";
		
		for (Item i : itemList) {
			output += i.toString();
		}
		
		return output;
	}

	public static Item inputMenuItem() {
		String itemID = Helper.readString("Enter item ID > ");
		String category = Helper.readString("Enter category > ");
		String foodName = Helper.readString("Enter food name > ");
		double price = Helper.readDouble("Enter meal price > ");
		
		Item i = new Item(itemID, category, foodName, price);
		return i;
		
	}
	
	public static void addMenuItem(ArrayList<Item> itemList, Item i) {
		itemList.add(i);
		
	}
	
	public static void deleteMenuItem(ArrayList<Item> itemList, Item i) {
		// TODO Auto-generated method stub
		itemList.remove(i);
		
	}
	//================================= Menu Method (Done by: Jocelyn) =================================
	public static Menu createMenu() {
		String ID = Helper.readString("Enter item ID > ");
		String date = Helper.readString("Enter  date > ");
		String Western = Helper.readString("Enter Western food > ");
		String Asian = Helper.readString("Enter Asian food > ");
		String Veggie = Helper.readString("Enter vegetarian food > ");
		String drink1 = Helper.readString("Enter drink 1 > ");
		String drink2 = Helper.readString("Enter drink 2 > ");
		String fruit1 = Helper.readString("Enter fruit 1 > ");
		String fruit2 = Helper.readString("Enter fruit 2 > ");

		Menu menu = new Menu(ID, date, Western, Asian, Veggie, drink1, drink2, fruit1, fruit2);
		return menu;
	}


	public static String retrieveAllMenu(ArrayList<Menu> menuList) {
		// TODO Auto-generated method stub
		String output = "";

		for (Menu i : menuList) {
			output += i.toString();

		}
		return output;

	}
public static void ViewAllMenu(ArrayList<Menu> menuList) {
		
	C206_CaseStudy.setHeader("MENU LIST");
	String output = String.format("%-10s %-15s %-20s %-25s %-30s %-35s %-40s %-45s %-50s\n","ID", "date", "Western", "Asian", "Veggie", "drink1", "drink2", "fruit1", "fruit2");
	output += retrieveAllMenu(menuList);
	System.out.println(output);
}


	public static void deleteMenu(ArrayList<Menu> menuList, Menu menu) {
		// TODO Auto-generated method stub
		for (int i = 0; i < menuList.size(); i++) {
			menuList.remove((i));
		}
	}
	
	//================================= LunchBox Method (Done by: Fikri) =================================
	public static String retreiveAllLunchBoxOrder(ArrayList<Order> orderList) {
		// TODO Auto-generated method stub
		String output = "";
		
		for (Order i: orderList) {
			output += i.toString();
		
		}
		return output;

	}
	public static void viewAllLunchBoxOrder(ArrayList<Order> orderList) {
		
		C206_CaseStudy.setHeader("LUNCHBOX ORDER LIST");
		String output = String.format("%-15s %-30s %-15s \n", "MEAL SET", "DRINK FRUITS SET",
				 "PRICE");
		 output += retreiveAllLunchBoxOrder(orderList);
		System.out.println(output);
	}
	
	public static Order inputLunchBoxOrder() {
		String orderID = Helper.readString("Enter orderID > ");
		String mealSet = Helper.readString("Enter meal set > ");
		String drinkFruitsSet = Helper.readString("Enter drink & fruits set > ");
		double price = Helper.readDouble("Enter meal price > ");
		
		Order o= new Order(orderID, mealSet, drinkFruitsSet, price);
		return o;
		
	}
	
	public static void addLunchBox(ArrayList<Order> orderList, Order o ) {
		// TODO Auto-generated method stub
		//inputLunchBoxOrder();
		orderList.add(o);
		
	}
	
	public static void deleteLunchBoxOrder(ArrayList<Order> orderList, Order o) {
		// TODO Auto-generated method stub
		//inputLunchBoxOrder();
		orderList.remove(o);
		
	}
	
	//================================= OrderBills Method (Done by: Fikri) =================================
	public static String retreiveAllOrderBills(ArrayList<Bills> billList) {
		// TODO Auto-generated method stub
		String output = "";
		
		for (Bills b: billList) {
			output += b.toString();
		
		}
		return output;
	}
	
	public static void ViewAllOrderBills(ArrayList<Bills> billList) {
		
		C206_CaseStudy.setHeader("ORDER BILLS LIST");
		String output = String.format("%-15s %-30s %-15s %-15s\n", "MEAL SET", "DRINK FRUITS SET",
				 "PRICE", "TOTAL AMOUNT");
		 output += retreiveAllOrderBills(billList);
		System.out.println(output);
	}
	
	public static Order inputOrderBill() {
		String orderID = Helper.readString("Enter order ID > ");
		String mealSet = Helper.readString("Enter meal set > ");
		String drinkFruitsSet = Helper.readString("Enter drink & fruits set > ");
		double price = Helper.readDouble("Enter meal price > ");
		double totalAmount = Helper.readDouble("Enter total amount > ");
		
		Bills b= new Bills(orderID, mealSet, drinkFruitsSet, price, totalAmount);
		return b;
		
	}
	
	public static void addOrderBill(ArrayList<Bills> billList, Bills b ) {
		// TODO Auto-generated method stub
		//inputOrderBill();
		billList.add(b);
		
	}
	public static void deleteOrderBills(ArrayList<Bills> billList, Bills b) {
		// TODO Auto-generated method stub
		//inputOrderBill();
		billList.remove(b);
		
	}
	public static boolean updateOrderBills(ArrayList<Bills> billList, String orderId) {
		// TODO Auto-generated method stub
		//inputOrderBill();
		boolean isUpdate = false;

		for (int i = 0; i < billList.size(); i++) {
			if (orderId.equalsIgnoreCase(billList.get(i).orderID()) && billList.get(i).getPrice() != 8.00) {
				billList.get(i).setPrice(8.00);
				isUpdate = true;
				
			}
		}
		return isUpdate;
		
	}
	


}

