import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//1.Create a list of N students
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many students to be created: ");
		int N = scanner.nextInt();
		ArrayList<Student> aList = new ArrayList<>(N);
		
		String names[] = {"Dam Thanh Tung", "Tran TUan Tu","A B C"};
		String cities[]= {"Ha Noi", "Ho Chi Minh", "Hai Phong"};
		
		Random random = new Random();
		for(int i=0; i<N; i++) {
//			String name = scanner.nextLine();
//			byte gender = scanner.nextByte();
//			String city = scanner.nextLine();
			String name = names[random.nextInt(names.length)];
			byte gender = (byte)(random.nextInt(3) - 1); //[-1,1]
			String city = cities[random.nextInt(cities.length)];


			aList.add(new Student(name, gender, city));
		}
		
		//--Verify the result
		System.out.printf("%-5s | %-25s | %-7s | %-25s \n", "ID" , "name" , "gender" , "city");
		System.out.printf("---------------------------------------------------------------- \n");
		for(Student each: aList) {
			each.print();
		}
		//2. Find percentage of MALE
		int count = 0;
		for (Student each: aList) {
			if(each.gender = Enum_Gender.MALE)
				count++;
		}
		System.out.printf("Male percentage is: %.2f%% \n",  (Student.COUNT_MALE *1.0/aList.size() *100));
		System.out.printf("Male percentage is: %.2f%% \n", Student.PERCENTAGE_MALE);
		
		//3.find students living in given city
	}
}
