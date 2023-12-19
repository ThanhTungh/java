import org.w3c.dom.Node;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int data;
			Node next;
			
			public Node(int data) {
				this.data = data;
				this.next = null;
				
	}
			
	public static void main(String[]args) {
				Node one = new Node(9);
				Node two = new Node(8);
				Node three = new Node(10);
				Node four = new Node(12);
				Node five = new Node(15);
			
				// Link nodes together, establish a list
				one.next = two;
				two.next = three;
				three.next = four;
				four.next = five;
				
				
				//test
				System.out.println(five.data);
				System.out.println(one.next.next.next.next.data);
				
				Node current = one;
				while(current.next != null) {
					System.out.print(current.data + " ");
					current = current.next; //Di chuyen sang node phia truoc
				}
				System.out.println();
				
			}

	}

}
