
public class Parent extends Account {
	private int contactNo;
	public Parent(int accountNo, String password, String username, int contactNo) {
		super(accountNo, password, username);
		this.contactNo = contactNo;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	public String toString() {
		String parentInfo = "";
		parentInfo = String.format("%-15d %-30s %-15s %-10d\n", getAccountNo(), getPassword(), getUsername(), contactNo);
	
		return parentInfo;
	}
	
}
