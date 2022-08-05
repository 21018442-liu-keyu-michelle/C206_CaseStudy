
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
	
	
}
