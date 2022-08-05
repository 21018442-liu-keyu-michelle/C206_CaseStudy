
import java.util.ArrayList;

public class C206_CaseStudy{// student 1 - bala
	
	public static void main(String[] args) {
		
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Order> orderList = new ArrayList<Order>();
		ArrayList<Bills> billList = new ArrayList<Bills>();
		ArrayList<Menu> menuBank = new ArrayList<Menu>();
		
		parentList.add(new Parent(1234, "7890", "Jeanlim12", 91459270));
		studentList.add(new Student(3680, 1359, "Matthewang90", "matthewang90@bedok.edu.sg"));
		
		
		orderList.add(new Order("Western food", "Apple and Juice", 4.50));
		orderList.add(new Order("Asian food", "Grapes and Green Tea", 4.00));
		orderList.add(new Order("Vegeterian food", "Orange and Soy Milk", 3.50));
		billList.add(new Bills("Western food", "Apple and Juice", 4.50,(4.50*20)));
		billList.add(new Bills("Asian food", "Grapes and Green Tea", 4.00, (4*20)));
		billList.add(new Bills("Vegeterian food", "Orange and Soy Milk", 3.50, (3.50*20)));
		menuBank.add(new Menu("Chicken Chop", 3.50));
		menuBank.add(new Menu("Japanese Bento", 3.00));
		menuBank.add(new Menu("Vegan meat with vegetables", 2.50));
		
		int option = 0;

		while (option != 16) {
			
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {

			} else if (option == 2) {
				
			} else if (option == 3) {
				
			} else if (option == 4) {
				
			} else if (option == 5) {
				
			} else if (option == 6) {
				
			} else if (option == 7) {
				
			} else if (option == 8) {
				
			} else if (option == 9) {
				
			} else if (option == 10) {
				
			} else if (option == 11) {
				
			} else if (option == 12) {
				
			} else if (option == 13) {
				  
			} else if (option == 14) {
				
			} else if (option == 15) {
				
			} else {
				System.out.println("Thank you for using this programme!!");
				
			}
			
			
		}

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

