class LinkedList {
    private int length = 0;
    /**
     Node object first.
     **/
    private Node first = null;
    /**
     Node object last.
     **/
    private Node last = null;
    /**
     class node for the linked list.
     **/
    private class Node {
        /**
         char item.
         **/
        private int item;
        /**
         Node object.
         **/
        private Node next;
    }
    /**
     to check if the stack is empty.
     @return bool value.
     **/
    public boolean isEmpty() {
        return first == null;
    }
    /**
     used to push the item.
     Here the time complexity is 1 since we push only one item at a time.
     * @param item int.
     **/
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
        length++;
    }
    /**
     Here the time complexity is 1 since we push only one item at a time.
     it is used to push the item at the end
     * @param item int.
     */
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
        length++;
    }
    /**
     * used to pop the item from the stack.
     * Here the time complexity is 1 since we pop only one item at a time.
     * @return string pop
     **/
    public void popAtStart() {
        if (first != null) {
            first = first.next;
            length--;
        }
    }
    // public void popAtEnd() {
    //     if (last != null) {
    //         Node temp = first;
    //         while (temp.next.next != null) {

    //             temp = temp.next;
    //         }
    //         temp.next = null;
    //         last = temp;
    //         length--;
    //     }
    // }
    /**
     used to check the item on the top.
     * @return first item.
     **/
    // public int top() {
    //     return first.item;
    // }
    // public int size() {
    //     return length;
    // }
     /**
      It is used to display the elements in the stack.
      Here the time complexity is N since the entire Stack is iterated.
      * @return String.
      **/
    public String displayAll() {
        if (length != 0) {
            String s = "";
            Node temp = first;
            while (temp != null) {
                s += temp.item + ", ";
                temp = temp.next;
            }
            return s.substring(0, s.length() - 2);
        }
        return "Steque is empty.";
    }
}
