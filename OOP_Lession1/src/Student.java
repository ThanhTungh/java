
public class Student {
	//properties: what information about student to the school
	//id,name, email

	public String name;
	public String id;
	public String email;
	
	
//	public Student() {
//		
//	}//default constructor
	//constructor is special method: là 1 method đặc biệt ko bao gồm kiểu trả về
	public Student (String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student (String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	/*
	  behavior
	 */
	public void checkAttendance () {
		
	}
	public void checkTimetable () {
		
	}
	public void checkgrade () {
		System.out.println("Veiw grade of student: " + name);
	}
}
