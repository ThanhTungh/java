
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student one = new Student ("Thanh Tung",1,"tungabv@gmail.com");
		one.print();
		Student two = new Student ("abc", 2,"abc@gmail.com");
		two.print();
		
//		one.id=2;// ko an toan
		//tinh chat encapsulation nham bao ve che dau thong tin
		//prevented user to access and change the information
		
		System.out.println(one.getId());
		one.setEmail("ggg@gmail.com");
//		one.email= "@demo";// ko the truy cap neu 2 file nam o 2 package
		one.print();
		
	
	}
}
