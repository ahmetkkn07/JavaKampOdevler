
public class Instructor extends User{
	
	private float salary;
	
	public Instructor(int id, String name, String username, String password, String email, float salary) {
		super(id, name, username, password, email);
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
