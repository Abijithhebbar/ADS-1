class LinkedList {
	private int size = 0;
	LinkedList() {
	}
	Node first = null;
	public class Node {
		Node() {
		}
		int item;
		Node next;
		Node(int inputItem) {
			this.item = inputItem;
		}
	}
	public int top() {
		return first.item;
	}
	public void push(int item) {
		Node nextAddress = new Node(item);
		nextAddress.next = first;
		first = nextAddress;
		size++;
	}
	public int pop() {
		int output = first.item;
		first = first.next;
		size--;
		return output;
	}

	public boolean isEmpty() {
		return first == null;
	}
	public String toString() {
		Node head = first;
		String storage = "";
		while(head != null) {
			storage = storage + head.item;
			head = head.next;
		}
		return storage;
	}
	public int size() {
		return size;
	}

}
