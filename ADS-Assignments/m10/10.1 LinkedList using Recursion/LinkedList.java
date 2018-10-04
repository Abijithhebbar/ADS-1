class Node {
    String data;
    Node next;
    Node(String val) {
        data = val;
    }
}
class LinkedList {
    Node start;
    int size;
    LinkedList() {
        start = null;
        size = 0;
    }
    /**
     * Complexity 1.
     * @param i Node type.
     **/
    void insert(Node i) {
        if (size == 0) {
            start = i;
            return;
        }
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * insertAt method.
     * It throws an exception when elements cant be inserted at the given position.
     * @param index int type.
     * @param n Node type.
     **/
    void insertAt(int index, Node n) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("");

        }

        if (index == 0) {
            n.next = start;
            start = n;
            size++;
            return;
        }
        start = insertAt(index, start, n, 0);

    }
    /**
     * @brief [brief description]
     * @details [long description]
     * insertAt method is used to insert the element at a particular position.
     * Complexity is N.
     * @param index int type.
     * @param first Node type.
     * @param element Node type.
     * @param count int type.
     * @return Node.
     **/
    Node insertAt(int index, Node first, Node element, int count ) {
        if (count == index) {
            element.next = first;
            return element;
        }
        first.next = insertAt(index, first.next, element, count + 1);
        size++;
        return first;
    }
    /**
    reverse method.
    It throws an exception if there are no elements.
    complexity is N.
     **/
    void reverse() throws Exception {
        if (start == null) {
            throw new Exception();
        }
        reverse(null, start);
    }
    /**
    reverse method.
    It throws an exception if there are no elements.
    complexity is N.
     * @param prev Node Type.
     * @param current Node Type.
     **/
    void reverse( Node prev, Node current) {
        if (current != null) {
            reverse(current, current.next);
            current.next = prev;
        } else {
            start = prev;
        }
    }
    /**
    Display method.
    Time complexity Is N.
     **/
    void display() {
        Node temp = start;
        String str = "";
        while (temp != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        System.out.println(str.substring(0, str.length() - 2));
    }
}