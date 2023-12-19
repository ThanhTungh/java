
public class MyLinkedList {	//Implement Singly Linked-List with forward connections
	private Node head;
	private Node tail;
	
	public void add(int data) {		//O(1)
		// 1. Tạo node mới
		Node aNode = new Node(data);
		// 2. Nối node cuối cùng trong danh sách vào node mới
		if(head==null) {
			head = aNode;
			tail = aNode;
		}else {
			tail.next = aNode;	//Nối tail vào node mới
			tail = aNode;		//Cập nhật lại vị trí của tail
		}
	}

//	public void add(int data) {		//O(n)
//		// 1. Tạo node mới
//		Node aNode = new Node(data);
//		// 2. Nối node cuối cùng trong danh sách vào node mới
//		if(head==null) {
//			head = aNode;
//		}else {
//			Node current = head;
//			while(current.next != null) {
//				current = current.next; //Di chuyển sang node phía trước
//			}
//			current.next = aNode;
//		}
//	}
	public String toString() {
		String str = "[";
		if(head!=null) {
			Node current = head;
			while(current.next != null) {
				str += current.data + ", ";
				current = current.next; //Di chuyển sang node phía trước
			}
			str += current.data;
		}
		str += "]";
		return str;
	}

	public Integer removeFirst() {
		if(head!=null) {
			Node tmp = head;	// Lưu tạm node head vào biến tmp
			head = head.next;	// Dịch chuyển head sang node phía trước
			tmp.next = null;	// Ngắt bỏ kết nối cũ
			return tmp.data;
		}else {
			return null;
		}
	}

	public void addFirst(int data) {
		Node aNode = new Node(data);
		aNode.next = head;
		head = aNode;
	}
	////////////////////////////////////

	public void add(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	public void removeLast() {
		// TODO Auto-generated method stub
		 
	}

	

}
