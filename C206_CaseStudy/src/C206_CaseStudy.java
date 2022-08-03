
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
		orderList.add(new Order("W101","Western food", "Apple and Juice", 4.50));
		orderList.add(new Order("A101","Asian food", "Grapes and Green Tea", 4.00));
		orderList.add(new Order("V101","Vegeterian food", "Orange and Soy Milk", 3.50));
		billList.add(new Bills("W101","Western food", "Apple and Juice", 3.50,(3.50*20)));
		billList.add(new Bills("A101","Asian food", "Grapes and Green Tea", 3.00, (3*20)));
		billList.add(new Bills("V101","Vegeterian food", "Orange and Soy Milk", 2.50, (2.50*20)));
		menuBank.add(new Menu("W101","01-08-2022","Chicken Chop", "Apple and Juice", 3.50));
		menuBank.add(new Menu("A101","01-08-2022","Japanese Bento", "Grapes and Green Tea", 3.00));
		menuBank.add(new Menu("V101","01-08-2022","Vegan meat with vegetables", "Orange and Soy Milk", 2.50));
		
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
		C206_CaseStudy.setHeader("MANAGE USER ACCOUNT");
		System.out.println("1. Add user account");
		System.out.println("2. View user account");
		System.out.println("3. Delete user account");
		Helper.line(80, "-");
		
	}
	public static void subMenuBank() {
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

}

