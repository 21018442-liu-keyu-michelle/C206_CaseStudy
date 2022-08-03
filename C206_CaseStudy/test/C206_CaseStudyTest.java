import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Parent parent;
	private Student student;
	private Order order1;
	private Order order2;
	private Order order3;
	private Bills bills1;
	private Bills bills2;
	private Bills bills3;
	private Menu menu1;
	private Menu menu2;
	private Menu menu3;
	private Item item1;
	private Item item2;
	private Item item3;
	
	
	//private ArrayList<Account> accountList = new ArrayList<Account>();
	private ArrayList<Parent> parentList = new ArrayList<Parent>();
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Order> orderList = new ArrayList<Order>();
	private ArrayList<Bills> billList = new ArrayList<Bills>();
	private ArrayList<Menu> menuList = new ArrayList<Menu>();
	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		parent = new Parent(1234, 7890, "Jeanlim12", 91459270);
		student = new Student(3680, 1359, "Matthewang90", "matthewang90@bedok.edu.sg");

		//day1order
		order1 = new Order("W101","Western food", "Apple and Juice", 4.50);
		order2 = new Order("A101","Asian food", "Grapes and Green Tea", 4.00);
		order3 = new Order("V101","Vegeterian food", "Orange and Soy Milk", 3.50);
		//day1bill
		bills1 = new Bills("W101","Western food", "Apple and Juice", 3.50,(3.50*20));
		bills2 = new Bills("A101","Asian food", "Grapes and Green Tea", 3.00, (3*20));
		bills3 = new Bills("V101","Vegeterian food", "Orange and Soy Milk", 2.50, (2.50*20));
		//day1item
		item1 = new Item("127", "Western food", "Chicken Chop" , "Apple Juice", "Banana", 4.50);
		item2 = new Item("128", "Asian food", "Japanese Bento", "Green Tea", "Grapes", 3.50);
		item3 = new Item("129", "Vegeterian food", "Vegan meat with rice", "Soy Milk", "Orange", 3.00);
		
		//day1menu
		menu1 = new Menu("127", "Western food", "Chicken Chop" , "Apple Juice", "Banana", 4.50, "W101", "01-08-2022");
		menu2 = new Menu("128", "Asian food", "Japanese Bento", "Green Tea", "Grapes", 3.50, "A101", "01-08-2022");
		menu3 = new Menu("129", "Vegeterian food", "Vegan meat with rice", "Soy Milk", "Orange", 3.00, "V101", "01-08-2022");
	
	}

	
	@Test
	public void testAddParents() {
		// Item list is not null, so that can add a new item - boundary
	
	}
	@Test
	public void testAddStudent() {
	
	}
	
	@Test
	public void testRetrieveAllParent() {
		
	}
	@Test
	public void testRetrieveAllStudent() {
		
	}

	@Test
	public void testDeleteParent() {
		
	}
	
	@Test
	public void testDeleteStudent() {
	
		
	}
	
	@Test
	public void testAddMenuItems() {
		assertNotNull("Test if there is an existing Item arrayList to add to", itemList);
		C206_CaseStudy.addMenuItem(itemList, item1);
		assertEquals("Test if that Item arraylist size is 1?", 1, itemList.size());
		assertSame("Test that Item is added same as 1st item of the list?", item1, itemList.get(0));
		C206_CaseStudy.addMenuItem(itemList, item2);
		C206_CaseStudy.addMenuItem(itemList, item3);
		assertEquals("Test that Item arraylist size is 3?", 3, itemList.size());
		assertSame("Test that Item is added same as 3rd item of the list?", item3, itemList.get(2));
		
	}
	@Test
	public void testViewMenuBanksItems() {
		assertNotNull("Test if there is valid Item arraylist to add to", itemList);
		String allMenuItems= C206_CaseStudy.retrieveAllMenuItems(itemList);
		String testOutput = "";
		assertEquals("Check that ViewAllMenuBank", testOutput, allMenuItems);
		C206_CaseStudy.addMenuItem(itemList, item1);
		C206_CaseStudy.addMenuItem(itemList, item2);
		C206_CaseStudy.addMenuItem(itemList, item3);
		assertEquals("Test if that Camcorder arraylist size is 3?", 3, itemList.size());
		allMenuItems= C206_CaseStudy.retrieveAllMenuItems(itemList);
		testOutput += String.format("%-10s %-10s %-15s %-30s %-10s %-10f", "127", "Western food", "Chicken Chop" , "Apple Juice", "Banana", 4.50);
		testOutput += String.format("%-10s %-10s %-15s %-30s %-10s %-10f", "128", "Asian food", "Japanese Bento", "Green Tea", "Grapes", 3.50);
		testOutput += String.format("%-10s %-10s %-15s %-30s %-10s %-10f","129", "Vegeterian food", "Vegan meat with rice", "Soy Milk", "Orange", 3.00);
		assertEquals("Check that ViewAllMenuBank", testOutput, allMenuItems);
		
	}
	@Test
	public void testDeleteMenuItem(){
		C206_CaseStudy.addMenuItem(itemList, item1);
		C206_CaseStudy.addMenuItem(itemList, item2);
		C206_CaseStudy.addMenuItem(itemList, item3);
		
		assertNotNull("Test if there is an existing Item arrayList to delete ", itemList);
		C206_CaseStudy.deleteMenuItem(itemList, item1);
		assertEquals("Test if that Item arraylist size is 2?", 2, itemList.size());
		C206_CaseStudy.deleteMenuItem(itemList, item2);
		assertEquals("Test that Item arraylist size is 1?", 1, itemList.size());
		C206_CaseStudy.deleteMenuItem(itemList, item3);
		assertEquals("Test that Item arraylist size is 0?", 0, itemList.size());
	}
	@Test
	public void testCreateMenu() {
		
	}
	@Test
	public void testViewMenu() {
		
	}
	@Test 
	public void testDeleteMenu() {
		
	}
	@Test
	public void testAddLunchBoxOrder(){
		assertNotNull("Test if there is an existing orderList arrayList to add to", orderList);
		C206_CaseStudy.addLunchBox(orderList, order1);
		assertEquals("Test if that orderList arraylist size is 1?", 1, orderList.size());
		assertSame("Test that Order is added same as 1st item of the list?", order1, orderList.get(0));
		C206_CaseStudy.addLunchBox(orderList, order2);
		C206_CaseStudy.addLunchBox(orderList, order3);
		assertEquals("Test that orderList arraylist size is 3?", 3, orderList.size());
		assertSame("Test that orderList is added same as 3rd item of the list?", order3, orderList.get(2));
		
	}
	@Test
	public void testViewLunchBoxOrder() {
		assertNotNull("Test if there is valid orderList arraylist to add to", orderList);
		String allLunchBoxOrder= C206_CaseStudy.retreiveAllLunchBoxOrder(orderList);
		String testOutput = "";
		assertEquals("Check that ViewLunchBoxOrder", testOutput, allLunchBoxOrder);
		C206_CaseStudy.addLunchBox(orderList, order1);
		C206_CaseStudy.addLunchBox(orderList, order2);
		C206_CaseStudy.addLunchBox(orderList, order3);
		assertEquals("Test if that orderList arraylist size is 3?", 3, orderList.size());
		allLunchBoxOrder= C206_CaseStudy.retreiveAllLunchBoxOrder(orderList);
		testOutput = String.format("%-15s %-30s %-10f","Western food", "Apple and Juice", 4.50 );
		testOutput += String.format("%-15s %-30s %-10f","Asian food", "Grapes and Green Tea", 4.00);
		testOutput += String.format("%-15s %-30s %-10f","Vegeterian food", "Orange and Soy Milk", 3.50);
		assertEquals("Check that viewAllLunchBoxOrder", testOutput, allLunchBoxOrder);
		
	}
	@Test
	public void testDeleteLunchBoxOrder() {
		C206_CaseStudy.addLunchBox(orderList, order1);
		C206_CaseStudy.addLunchBox(orderList, order2);
		C206_CaseStudy.addLunchBox(orderList, order3);
		
		assertNotNull("Test if there is an existing orderList arrayList to delete ", orderList);
		C206_CaseStudy.deleteLunchBoxOrder(orderList, order1);
		assertEquals("Test if that orderList arraylist size is 2?", 2, orderList.size());
		C206_CaseStudy.deleteLunchBoxOrder(orderList, order2);
		assertEquals("Test that orderList arraylist size is 1?", 1, orderList.size());
		C206_CaseStudy.deleteLunchBoxOrder(orderList, order3);
		assertEquals("Test that orderList arraylist size is 0?", 0, orderList.size());
		
		
	}
	@Test
	public void testAddOrderBill() {
		assertNotNull("Test if there is an existing billList arrayList to add to", billList);
		C206_CaseStudy.addOrderBill(billList, bills1);
		assertEquals("Test if that billList arraylist size is 1?", 1, billList.size());
		assertSame("Test that Bill is added same as 1st item of the list?", bills1, billList.get(0));
		C206_CaseStudy.addOrderBill(billList, bills2);
		C206_CaseStudy.addOrderBill(billList, bills3);
		assertEquals("Test that billList arraylist size is 3?", 3, billList.size());
		assertSame("Test that orderList is added same as 3rd item of the list?", bills3, billList.get(2));
		
	}
	@Test
	public void testViewOrderBill() {
		assertNotNull("Test if there is valid orderList arraylist to add to", billList);
		String allOrderBill= C206_CaseStudy.retreiveAllOrderBills(billList);
		String testOutput = "";
		assertEquals("Check that ViewOrderBills", testOutput, allOrderBill);
		C206_CaseStudy.addOrderBill(billList, bills1);
		C206_CaseStudy.addOrderBill(billList, bills2);
		C206_CaseStudy.addOrderBill(billList, bills3);
		assertEquals("Test if that billList arraylist size is 3?", 3, billList.size());
		allOrderBill= C206_CaseStudy.retreiveAllOrderBills(billList);
		testOutput = String.format("%-15s %-30s %-10f%-15f\n","Western food", "Apple and Juice", 4.50,(4.50*20));
		testOutput += String.format("%-15s %-30s %-10f%-15f\n","Asian food", "Grapes and Green Tea", 4.00, (4.00*20));
		testOutput += String.format("%-15s %-30s %-10f%-15f\n","Vegeterian food", "Orange and Soy Milk", 3.50, (3.50*20));
		assertEquals("Check that ViewAllOrderBills", testOutput, allOrderBill);
		
		
	}
	@Test
	public void testDeleteOrderBill() {
		C206_CaseStudy.addOrderBill(billList, bills1);
		C206_CaseStudy.addOrderBill(billList, bills2);
		C206_CaseStudy.addOrderBill(billList, bills3);
		
		assertNotNull("Test if there is an existing billList arrayList to delete ", billList);
		C206_CaseStudy.deleteOrderBills(billList, bills1);
		assertEquals("Test if that billList arraylist size is 2?", 2, billList.size());
		C206_CaseStudy.deleteOrderBills(billList, bills2);
		assertEquals("Test that billList arraylist size is 1?", 1, billList.size());
		C206_CaseStudy.deleteOrderBills(billList, bills3);
		assertEquals("Test that billList arraylist size is 0?", 0, billList.size());
		
	}
	
	
	@After
	public void tearDown() throws Exception {

	}

}

