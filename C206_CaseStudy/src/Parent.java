
public class Parent extends Account {
	private int contactNo;

	public Parent(int accountNo, int password, String username, int contactNo) {
		super(accountNo, password, username);
		this.contactNo = contactNo;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public Object size() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
