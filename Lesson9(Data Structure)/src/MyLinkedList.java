
public class MyLinkedList<T> {

	private class Node{
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	Node tail;
	
	public MyLinkedList() {
		head = null;
		tail = null;
	}
	
	public void add(T data) {//add a new element to the end of node
		//1. Create a new node
		Node aNode = new Node(data);
		if(head == null) {
			head = aNode;
			tail = aNode;
		}else {
		//2. Identify the last node
//		Node current = head;
//		while(current.next != null) {
//			current = current.next;
//		}
		//3. Connect the last node to the new created node
//		current.next = aNode;
			tail.next = aNode;
			tail = aNode;
		}
	}
	
	public void addFirst(T data) {
		//1. Create a new node
		Node aNode = new Node(data);
		if(head == null) {
			head = aNode;
			tail = aNode;
		}else {
		//2. Connect the new node to 'head' node
		aNode.next = head;
		//3. Update the new position for head
		head = aNode;
		}
	}
}
