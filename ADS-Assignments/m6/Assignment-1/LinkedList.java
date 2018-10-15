class LinkedList {
	private int size = 0;
	LinkedList() {
	}
	Node first = null;
	Node last = null;
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
	public int popAtStart() {
		int output = first.item;
		first = first.next;
		size--;
		return output;
	}
	public void pushAtStart(final int item) {
        if (first == null) {
            //Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = null;
            last = first;
        } else {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
        }
        size++;
    }
    public void pushAtEnd(final int item) {
        if (last == null || first == null) {
            // last = new Node();
            // last.item = item;
            // last.next = null;
            // first = last;
            pushAtStart(item);
        }   else {
            Node temp = last;
            last = new Node();
            last.item = item;
            last.next = null;
            temp.next = last;
        }
        size++;
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
