import java.util.Scanner;
/**
*Class linked list.
*/
class LinkedList {
    /**
    *Default constructor of the above class.
    */
    LinkedList() {
    }
    /**
    *Creating a Node and assigning value to it.
    */
    private Node first = null;
    /**
     Integer size.
     */
     private int size = 0;
    /**
    *Class Node.
    */
    public class Node {
        /**
        *A default constructor.
        */
        Node() {
        }
        /**
        *Declaring an integer data type.
        */
        private int item;
        /**
        *Creating a node.
        */
        private Node next;
        /**
        *Over ridden constructor.
        *@param inputItem input item.
        */
        Node(final int inputItem) {
            this.item = inputItem;
        }
    }
    /**
    *get the top element in the stack.
    *@return item.
    */
    public int top() {
        return first.item;
    }
    /**
    *pushes the element or item into the stack.
    *@param item input.
    */
    public void push(final int item) {
        Node nextAddress = new Node(item);
        nextAddress.next = first;
        first = nextAddress;
        size++;
    }
    /**
    *removes the element.
    *@return output.
    */
    public int pop() {
        int output = first.item;
        first = first.next;
        size--;
        return output;
    }
    /**
    *This method checks if the list is empty.
    *@return true or false.
    */
    public boolean isEmpty() {
        return first == null;
    }
    /**
     * @return size.
     */
    public int size() {
    	return size;
    }
    /**
    *This method converts from digits to numbers.
    *@return Storge which is the converted.
    */
    public String toString() {
        Node head = first;
        String storage = "";
        while (head != null) {
            storage = storage + head.item;
            head = head.next;
        }
        return storage;
    }
}