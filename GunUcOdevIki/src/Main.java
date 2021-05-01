public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Ahmet KÖKEN" , "ahmetkkn07", "123321", "ahmetkkn07@gmail.com", "Gazi Üniversitesi");
		
		Instructor instructor = new Instructor(2, "Engin DEMİROĞ", "engindemirog", "456654", "engindemirog@gmail.com", 15000);
		
		UserManager userManager = new UserManager();
		
		userManager.add(student);
		userManager.add(instructor);
	
	}

}
