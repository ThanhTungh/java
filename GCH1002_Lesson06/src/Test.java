import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		MyLinkedList aList = new MyLinkedList();
		aList.add(9);
		aList.add(8);
		aList.add(10);
		aList.add(12);
		aList.add(7);
		
		System.out.println(aList.toString());
//		aList.add(1, 100);
//		System.out.println(aList.toString());
//		aList.remove(1); //Remove element 100
//		aList.removeLast(); //Remove element 7
		Integer a = aList.removeFirst(); //Remove element 9
		System.out.println("Phan tu duoc xoa la: " + a);
		if(a!=null) {
			//...
			System.out.println("Phan tu duoc xoa la: " + a);
		}
		System.out.println(aList.toString());
		aList.addFirst(200); //Add element 200
		System.out.println(aList.toString());
	}

}
