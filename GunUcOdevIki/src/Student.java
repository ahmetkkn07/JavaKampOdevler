
public class Student extends User{
	
	private String school;

	public Student(int id, String name, String username, String password, String email,String school) {
		super(id, name, username, password, email);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}
