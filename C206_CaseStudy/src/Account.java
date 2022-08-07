
public class Account {
	private int accountNo;
	private String password;
	private String username;
	
	public Account(int accountNo, String password, String username) {
		this.accountNo = accountNo;
		this.password = password;
		this.username = username;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
