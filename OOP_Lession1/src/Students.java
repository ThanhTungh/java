
public class Students {
	public int id;
	public String name;
	
	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.printf("%-5d | %-20s \n ", id , name);
		//cach2
		System.out.println("ID: " + id+ " | " + "Name: " + name);
	}

}
