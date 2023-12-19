// encapsulation  ta se su dung ket hop access modifier va getter setter method
//access modifier quy dinh pham vi truy cap cua thuoc tinh hoac phuong thuc
//		public: cho phep truy cap 1 cach cong khai
//		protected: cho pheptruy cap trong lop khai bao ca bien hay phuong thuc do, cac lop ke thua tu lop nay, cac lop trong cung 1 package
//		private: chi duoc truy cap trong chinh lop khai bao
//getter method : ham cho phep truy cap doc
//setter method : ham cho phep truy cap ghi
public class Student {
	private int id;
	private String name;
	private String email;

	public Student (String name, int id, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
		
		}
	public void print() {
		System.out.printf("%-10s | %-10s | %-10s \n ", id , name , email);
	}
	//---------------------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
