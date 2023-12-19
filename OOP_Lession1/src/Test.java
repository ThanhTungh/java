
public class Test {
	
	public static void main(String[] args) {

//		Student one = new Student();
//		//Create object from the definition of class student by using its constructor
//		
//		one.id = "GCH0195";
//		one.name = "Tran Tuan Tu";
//		one.email = "gch0195@fpt.edu.vn";
		Student one = new Student ("GCH0195","Thanh Tung");
		one.checkgrade();
//		Student.checkgrade();
		Student two = new Student ("GCH0195","Dam Thanh Tung","tung@gmail.com");
		two.checkgrade();
	}
}
