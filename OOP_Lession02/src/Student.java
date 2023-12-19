
public class Student {
	//1.Properties
	int id;
	String name;
	byte gender;
	String city;
	
	private static int COUNT = 100;//dat so thu tu tu 100++ 
	static int COUNT_MALE = 0;
	public static double PERCENTAGE_MALE = 0;
	//2.Construction
	public Student (String name, byte gender, String city) {
		this.id = COUNT++; //incremental ID
		this.name = name;
		this.gender = gender;
		if(gender == Enum_Gender.MALE) {
			COUNT_MALE++;
		}
		PERCENTAGE_MALE = COUNT_MALE *1.0/(COUNT-100)*100;
		this.city = city;
	}
	//3.Behaviors
	public void print() {
		String str = "Others";
		if(gender == Enum_Gender.MALE) str = "Male";
		else if (gender == Enum_Gender.FEMALE) str = "Female";
		System.out.printf("%-5d | %-25s | %-10s | %-25s \n", id, name, str,city);
	}

	
}
