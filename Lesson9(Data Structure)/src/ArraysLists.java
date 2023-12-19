import java.util.ArrayList;

public class ArraysLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList = new ArrayList<>();
		ArrayList<Integer> bList = new ArrayList<>();
		
		aList.add(9);
		aList.add("Tung");
		aList.remove(0);//remove 9
		System.out.println(aList.toString());
		System.out.println(bList.toString());
		
		MyArrayList clist = new MyArrayList();
//		clist.add(9);
	}

}
