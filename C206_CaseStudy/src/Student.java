
public class Student extends Account {
	private String schoolEmail;
	public Student(int accountNo, String password, String username, String schoolEmail) {
		super(accountNo, password, username);
		this.schoolEmail = schoolEmail;
	}

	public String getSchoolEmail() {
		return schoolEmail;
	}

	public void setSchoolEmail(String schoolEmail) {
		this.schoolEmail = schoolEmail;
	}
	
	public String toString() {
		String studentInfo = "";
		studentInfo = String.format("%-15d %-30s %-15s %-10s\n", getAccountNo(), getPassword(), getUsername(), schoolEmail);
	
		return studentInfo;
	}

}
