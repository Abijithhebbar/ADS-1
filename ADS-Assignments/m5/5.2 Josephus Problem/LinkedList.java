import java.util.Arrays;
/**
 * Class for node.
 */
class Node {
    int data;
    Node next;
    Node(int value) {
        data = value;
        next = null;
    }
    public Node getAddress() {
        return next;
    }
    public void setAddress(Node address) {
        next = address;
    }

    public void setdata(int data1) {
        data = data1;
    }
}

class Operations {
    Node Start;
    Node last;
    int size;
    public void pushAtStart(int data) {
        Node start = new Node(data);
        size++;
        if (Start == null) {
            Start = start;
            last = start;
            return;
        }
        start.setAddress(Start);
        Start = start;
        return;
    }

    public void pushAtelement(int data, int element) {
        Node ins = new Node(element);
        Node temp1 = Start;
        int flag = 0;
        while (temp1.data != data) {
            temp1 = temp1.getAddress();
            if (temp1.data == data) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            Node temp2 = temp1.getAddress();
            temp1.setAddress(ins);
            ins.setAddress(temp2);
            size++;
        }
    }

    public void pushAtend(int data) {
        Node end = new Node(data);
        size++;
        if (Start == null) {
            Start = end;
            last = end;
            return;
        }
        last.next = end;
        last = end;
        return;
    }

    public void popAtStart() {
        if (size == 0) {
            System.out.println("Deck is empty");
            return;
        }
        Node temp = Start;
        Start = Start.getAddress();
        temp = null;
        size--;
    }

    public void popAtEnd() {
        if (size == 0) {
            System.out.println("Deck is empty");
            return;
        }
        Node temp = Start;
        while (temp.next.next != null) {
            temp = temp.getAddress();
        }
        last = temp;
        temp.next = null;
        size--;
    }
    public void popAtElement(int data) {
        Node temp = Start;
        while (temp.data != data) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public String print() {
        Node temp = Start;
        String str = "[";
        if (size > 0) {
            while (temp.next != null) {
                str += temp.data + ", ";
                temp = temp.getAddress();
            }
            str += temp.data;
        }
        str += "]";
        return str;
    }
    public int size() {
        return size;
    }

    public int[] joseph(int m, int size) {
        int[] arr = new int[size];
        Node temp = Start;
        int counter = 1;
        int i = 0;
        while (temp.next != null) {
            while (counter != m) {
                pushAtend(temp.data);
                temp = temp.next;
                popAtStart();
                counter++;
            }
        arr[i++] = temp.data;
        temp = temp.next;
        counter = 1;
        popAtStart();
        }
        arr[i++] = temp.data;
        return arr;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Operations op = new Operations();
    }
}