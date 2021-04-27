
public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Kategori 2");
		Category category3 = new Category(3, "Kategori 3");

		Category[] categories = { category1, category2, category3 };

		CategoryManager categoryManager = new CategoryManager();
		for (Category category : categories) {
			categoryManager.addCategory(category);
			System.out.println("Kategori: " + category.name);
		}

		Course course1 = new Course(1, "C#", "C# geliştirici kampına katılmalısınız.", 1, 0, "Engin Demiroğ");
		Course course2 = new Course(2, "Java", "Java geliştirici kampına katılmalısınız.", 1, 15, "Engin Demiroğ");
		Course course3 = new Course(3, "Python", "Python geliştirici kampına katılmalısınız.", 1, 29.90f,
				"Engin Demiroğ");

		Course[] courses = { course1, course2, course3 };

		CouseManager couseManager = new CouseManager();
		for (Course course : courses) {
			couseManager.addCourse(course);
			System.out.println("Kurs: " + course.name);
		}
	}

}
