
public class Node <T> {
	int data; //luu gia tri 1 phan tu trong danh sach
	Node next;//luu dia chi cua phan tu sau
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public static void main(String[] args) {
		Node one = new Node(9);
		Node two = new Node(7);
		Node three = new Node(12);
		Node four = new Node(5);
		//one: 9-null  two:7-null  three:12-null   moi node la 1 phan tu doc lap
		//create a singly linked list
		
		one.next = two;
		two.next = three;
		three.next = four;
		
		System.out.println(four.data);
		System.out.println(one.next.next.next.data);
		
		Node current = one;//At the beginning current start at one
		while(current != null) {
			System.out.print(current.data+ " ");//print the data
			current = current.next;//Move the current to next node		
		}
		System.out.println();
	}
}
