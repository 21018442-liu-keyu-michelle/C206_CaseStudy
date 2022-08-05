
import java.util.ArrayList;

public class C206_CaseStudy{
	
	public static void main(String[] args) {
		
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Order> orderList = new ArrayList<Order>();
		ArrayList<Bills> billList = new ArrayList<Bills>();
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		ArrayList<Item> itemList = new ArrayList<Item>();
	
		parentList.add(new Parent(1235, "qweasdzxc", "JonTay14", 99135697));
		parentList.add(new Parent(1236, "abcdefg", "VenessaOng69", 91524644));
		studentList.add(new Student(3680, "1359", "Matthewang90", "matthewang90@bedok.edu.sg"));
		studentList.add(new Student(3681, "iopjklnm", "Farah790", "farahQuek49@bedok.edu.sg"));
		studentList.add(new Student(3682, "jkfebvyg", "Sarah0823", "sarahran295@bedok.edu.sg"));
		orderList.add(new Order("W101","Western food", "Apple and Juice", 4.50));
		orderList.add(new Order("A101","Asian food", "Grapes and Green Tea", 4.00));
		orderList.add(new Order("V101","Vegeterian food", "Orange and Soy Milk", 3.50));

		billList.add(new Bills("W101","Western food", "Apple and Juice", 3.50,(3.50*20)));
		billList.add(new Bills("A101","Asian food", "Grapes and Green Tea", 3.00, (3*20)));
		billList.add(new Bills("V101","Vegeterian food", "Orange and Soy Milk", 2.50, (2.50*20)));
		
		itemList.add(new Item("127", "Western food", "Chicken Chop" , 4.50));
		itemList.add(new Item("125", "Drink", "Apple Juice" , 1.50));
		itemList.add(new Item("126", "Fruit", "Banana" , 1.00));
		
		itemList.add(new Item("128", "Asian food", "Beef Don", 5.50));
		itemList.add(new Item("129", "Drink", "Orange Juice", 1.50));
		itemList.add(new Item ("130", "Fruit", "Grape", 2.00));
		itemList.add(new Item("131", "Vegeterian food", "Rice with vegan meat", 3.50));
		itemList.add(new Item("132", "Drink", "Soy Milk", 1.00));
		itemList.add(new Item("133", "Fruit", "Apple", 1.00));
		
		menuList.add(new Menu("127", "01-08-2022", "Spaghetti", "Wanton Mee", "Vegetarian Bee Hoon", "Green tea",
				"Orange Juice", "Honeydew Juice", "Watermelon Slice", "Apple Slice","Pineapple Slice"));
		menuList.add(new Menu("128", "02-08-2022", "Fish And Chips", "Dumpling Soup", "Veggie Fried Rice",
				"Orange Juice", "Apple Juice","Chocolate Milk", "Watermelon", "Honey Dew","Grapes"));
		menuList.add(new Menu("129", "03-08-2022", "Chicken Cutlet", "Ramen", "Stuffed Baby Eggplant",
				"Blueberry Juice", "Coke","Pomegranate Juice", "Pear", "Papaya","Coconut"));
		menuList.add(new Menu("130", "04-08-2022", "Chicken Chop", "Sushi", "Vegetable Soup", "Ice Lemon Tea",
				"Sugar Cane Juice", "Cranberry Juice", "Mango", "Blueberry","Peach Slice"));
		menuList.add(new Menu("131", "05-08-2022", "Steak", "Chicken Rice", "Vegetarian Bee Hoon", "Green tea",
				"Orange Juice", "Strawberry Milk", "Watermelon Slice", "Apple Slice", "Pear Slice"));
		menuList.add(new Menu("132", "06-08-2022", "Barbecue Ribs", "Satay", "Vegetarian Curry Noddle", "Sprite",
				"7 Up", "Ribena","Strawberries", "Avocado","Passion Fruit"));
		menuList.add(new Menu("133", "07-08-2022", "Pork Loin", "Laksa", "Economy Rice", "Minute Maid", "100 Plus","Milk Tea",
				"Blackberry", "Raspberry","Grapefruit"));
	}
	{
		int option = 0;

		while (option != 6) {
			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				retreiveAllLunchBoxOrder(null);
				//subMenuUserAccount();

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
		String drink3 = Helper.readString("Enter drink 3 > ");
		String fruit1 = Helper.readString("Enter fruit 1 > ");
		String fruit2 = Helper.readString("Enter fruit 2 > ");
		String fruit3 = Helper.readString("Enter fruit 3 > ");

		Menu menu = new Menu(ID, date, Western, Asian, Veggie, drink1, drink2, drink3, fruit1, fruit2,fruit3);
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
	String output = String.format("%-10s %-15s %-20s %-25s %-30s %-35s %-40s %-45s %-50s %-55s %-60s\n","ID", "date", "Western", "Asian", "Veggie", "drink1", "drink2","drink3", "fruit1", "fruit2","fruit3");
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
		String output = String.format("%-10s %-30s %-10s\n", "MEAL SET", "DRINK FRUITS SET",
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
		String output = String.format("%-15s %-30s %-10s %-10s\n", "MEAL SET", "DRINK FRUITS SET",
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
	
	// ========================= Account method (Done by Baala) ===============================================================
	
	public static void addParent(ArrayList<Parent> parentList, Parent p) {
		// TODO Auto-generated method stub
		//inputParents();
		parentList.add(p);
	}

	
	private static Parent inputParents() {
		// TODO Auto-generated method stub
		int accountNo = Helper.readInt("Enter account number > ");
		String password = Helper.readString("Enter password > ");
		String username = Helper.readString("Enter username > ");
		int contactNo = Helper.readInt("Enter contact number > ");
		
		Parent p = new Parent(accountNo, password, username, contactNo);
		return p;
		
	}
	public static String retrieveAllParent(ArrayList<Parent> parentList) {
		// TODO Auto-generated method stub
		String output = "";
		 
		for (Parent p : parentList) {
			output += p.toString();
		}
		return output;
	}
	public static void deleteParent(ArrayList<Parent> parentList, Parent p) {
		// TODO Auto-generated method stub
		parentList.remove(p);
	}
// ======================================================================================================
	public static void addStudent(ArrayList<Student> studentList, Student s) {
		// TODO Auto-generated method stub
		//inputParents();
		studentList.add(s);
	}

	
	private static Student inputStudents() {
		// TODO Auto-generated method stub
		int accountNo = Helper.readInt("Enter account number > ");
		String password = Helper.readString("Enter password > ");
		String username = Helper.readString("Enter username > ");
		String schoolEmail = Helper.readString("Enter school Email > ");
		
		Student s = new Student(accountNo, password, username, schoolEmail);
		return s;
		
	}
	public static String retrieveAllstudent(ArrayList<Student> studentList) {
		// TODO Auto-generated method stub
		String output = "";
		 
		for (Student s : studentList) {
			output += s.toString();
		}
		return output;
	}
	public static void deleteStudent(ArrayList<Student> studentList, Student s) {
		// TODO Auto-generated method stub
		studentList.remove(s);
	}
	

}

