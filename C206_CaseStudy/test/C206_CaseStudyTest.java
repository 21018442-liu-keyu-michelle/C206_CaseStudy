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
	
	//private ArrayList<Account> accountList = new ArrayList<Account>();
	private ArrayList<Parent> parentList = new ArrayList<Parent>();
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Order> orderList = new ArrayList<Order>();
	private ArrayList<Bills> billList = new ArrayList<Bills>();
	private ArrayList<Menu> menuBank = new ArrayList<Menu>();
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		parent = new Parent(1234, 7890, "Jeanlim12", 91459270);
		student = new Student(3680, 1359, "Matthewang90", "matthewang90@bedok.edu.sg");
		order1 = new Order("Western food", "Apple and Juice", 4.50);
		order2 = new Order("Asian food", "Grapes and Green Tea", 4.00);
		order3 = new Order("Vegeterian food", "Orange and Soy Milk", 3.50);
		bills1 = new Bills("Western food", "Apple and Juice", 4.50,(4.50*20));
		bills2 = new Bills("Asian food", "Grapes and Green Tea", 4.00, (4*20));
		bills3 = new Bills("Vegeterian food", "Orange and Soy Milk", 3.50, (3.50*20));
		menu1 = new Menu("Chicken Chop", 3.50);
		menu2 = new Menu("Japanese Bento", 3.00);
		menu3 = new Menu("Vegan meat with vegetables", 2.50);
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
	public void testAddMenuBanks() {
		assertNotNull("Test if there is an existing Menu arrayList to add to", menuBank);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
	}
	@Test
	public void testRetrieveMenuBanksItems() {
		
	}
	@Test
	public void testDeleteMenuBanks(){
		
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
		
	}
	@Test
	public void testViewLunchBoxOrder() {
		
	}
	@Test
	public void testDeleteLunchBoxOrder() {
		
	}
	@Test
	public void testAddOrderBill() {
		
	}
	@Test
	public void testViewOrderBill() {
		
	}
	@Test
	public void testDeleteOrderBill() {
		
	}
	
	
	@After
	public void tearDown() throws Exception {

	}

}

