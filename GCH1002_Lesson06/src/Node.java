
public class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public static void main(String[] args) {
		Node one = new Node(9);
		Node two = new Node(8);
		Node three = new Node(10);
		Node four = new Node(12);
		Node five = new Node(7);
		
		//Link nodes together, establish a list
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		
		//Test
		System.out.println(five.data);
		System.out.println(one.next.next.next.next.data);
		
		//
		Node current = one;
		while(current.next != null) {
			System.out.print(current.data + " ");
			current = current.next; //Di chuyển sang node phía trước
		}	
		//Sau khi kết thức 'while', current đang dừng lại ở Node cuối
		System.out.println(current.data);
	}
}
