
public class Student extends Account {
	private String schoolEmail;

	public Student(int accountNo, int password, String username, String schoolEmail) {
		super(accountNo, password, username);
		this.schoolEmail = schoolEmail;
	}

	public String getSchoolEmail() {
		return schoolEmail;
	}

	public void setSchoolEmail(String schoolEmail) {
		this.schoolEmail = schoolEmail;
	}
	
	

}
