
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person one = new Person("Chien", "Bac Giang");
		System.out.println(one.toString());
		Student two = new Student("Thuan", "Ha Noi");
		System.out.println(two.toString());
		two.addCourseGrade("Java", 9);
	}

}
