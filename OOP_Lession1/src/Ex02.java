import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		Students one = new Students(101, "Tung");
		//Create an array of student
		
		Students std[] = new Students[15];
		int count = 0;
		std[0] = one;
		count++;
		std[1] = new Students(202, "Tuan");
		count++;
		System.out.println("Length of array: " + std.length);
		System.out.println("Current number of student: " + count);
		
		for(int i=0; i<count; i++) {
			std[i].print();
		}
		
		//Create an arraylist of student
		ArrayList<Students> aList = new ArrayList<>();
		aList.add(one);
		aList.add(new Students(202, "Tuan"));
		System.out.println("Current number of student: " + aList.size());
		
		//Duyet doi tuong  thong qua chi so index
		for(int i=0; i<aList.size(); i++) {
			aList.get(i).print();
		}
		//Duyet thong qua doi tuong
		for(Students each: aList) {
			each.print();
		}
		//Duyet thong qua doi tuong, supported from JDK 11
		aList.forEach(each -> each.print());
	}
	
}
