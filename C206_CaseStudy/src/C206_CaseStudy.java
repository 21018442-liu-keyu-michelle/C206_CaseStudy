
import java.util.ArrayList;

public class C206_CaseStudy{// student 1 - bala
	
	public static void main(String[] args) {
		
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Order> orderList = new ArrayList<Order>();
		ArrayList<Bills> billList = new ArrayList<Bills>();
		ArrayList<Menu> menuBank = new ArrayList<Menu>();
		
		parentList.add(new Parent(1234, 7890, "Jeanlim12", 91459270));
		studentList.add(new Student(3680, 1359, "Matthewang90", "matthewang90@bedok.edu.sg"));
		orderList.add(new Order("Western food", "Apple and Juice", 4.50));
		orderList.add(new Order("Asian food", "Grapes and Green Tea", 4.00));
		orderList.add(new Order("Vegeterian food", "Orange and Soy Milk", 3.50));
		billList.add(new Bills("Western food", "Apple and Juice", 4.50,(4.50*20)));
		billList.add(new Bills("Asian food", "Grapes and Green Tea", 4.00, (4*20)));
		billList.add(new Bills("Vegeterian food", "Orange and Soy Milk", 3.50, (3.50*20)));
		menuBank.add(new Menu("Chicken Chop", "Apple and Juice", 3.50));
		menuBank.add(new Menu("Japanese Bento","Grapes and Green Tea", 3.00));
		menuBank.add(new Menu("Vegan meat with vegetables","Orange and Soy Milk", 2.50));
		
		int option = 0;

		while (option != 6) {
			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				subMenuUserAccount();

			} else if (option == 2) {
				subMenuBank();
				
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
		C206_CaseStudy.setHeader("LUNCHBOXORDER APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");
		
	}
	public static void subMenuBank() {
		C206_CaseStudy.setHeader("LUNCHBOXORDER APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");
		
	}
	public static void subMenu() {
		C206_CaseStudy.setHeader("LUNCHBOXORDER APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");
		
	}
	public static void subMenuLunchBoxOrders() {
		C206_CaseStudy.setHeader("LUNCHBOXORDER APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");
		
	}
	public static void subMenuOrderBills() {
		C206_CaseStudy.setHeader("LUNCHBOXORDER APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");
		
	}
	//================================= SetHeader Method (Done by: Fikri) =================================
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	//================================= MenuBank Method (Done by: Michelle) =================================
	public static String retrieveAllMenuItems(ArrayList<Menu> menuBank) {
		String output = "";
		
		for (Menu m : menuBank) {
			output += m.toString();
		}
		
		return output;
	}

	public static Menu inputMenuBank() {
		String foodName = Helper.readString("Enter food name > ");
		String drinkFruitsSet = Helper.readString("Enter drink & fruits set > ");
		double price = Helper.readDouble("Enter meal price > ");
		
		Menu m = new Menu(foodName, drinkFruitsSet, price);
		return m;
		
	}
	
	public static void addMenuItem(ArrayList<Menu> menuBank, Menu m) {
		//inputMenuBank();
		menuBank.add(m);
		
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
		String mealSet = Helper.readString("Enter meal set > ");
		String drinkFruitsSet = Helper.readString("Enter drink & fruits set > ");
		double price = Helper.readDouble("Enter meal price > ");
		
		Order o= new Order(mealSet, drinkFruitsSet, price);
		return o;
		
	}
	
	public static void addLunchBox(ArrayList<Order> orderList, Order o ) {
		// TODO Auto-generated method stub
		inputLunchBoxOrder();
		orderList.add(o);
		
	}
	public static void deleteLunchBoxOrder(ArrayList<Order> orderList, Order o) {
		// TODO Auto-generated method stub
		inputLunchBoxOrder();
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
		String mealSet = Helper.readString("Enter meal set > ");
		String drinkFruitsSet = Helper.readString("Enter drink & fruits set > ");
		double price = Helper.readDouble("Enter meal price > ");
		double totalAmount = Helper.readDouble("Enter total amount > ");
		
		Bills b= new Bills(mealSet, drinkFruitsSet, price, totalAmount);
		return b;
		
	}
	
	public static void addOrderBill(ArrayList<Bills> billList, Bills b ) {
		// TODO Auto-generated method stub
		inputOrderBill();
		billList.add(b);
		
	}
	public static void deleteOrderBills(ArrayList<Bills> billList, Bills b) {
		// TODO Auto-generated method stub
		inputOrderBill();
		billList.remove(b);
		
	}

}

