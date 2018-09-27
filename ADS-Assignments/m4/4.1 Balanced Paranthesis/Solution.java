import java.util.Scanner;
/**
class Solution.
 **/
final class Solution {
    /**
    default constructor.
     **/
    private Solution() {

    }
    /**
     * main function.
     * @param args String.
     **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String inp = sc.next();
            if (check(inp)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    /**
     * check method checks whether the item is in stack or not.
     * @param inp string.
     * @return treu or false.
     **/
    public static boolean check(final String inp) {
        LinkedStackOfStrings link = new LinkedStackOfStrings();
        int size = inp.length();
        for (int i = 0; i < size; i++) {
            char check1 = inp.charAt(i);
            if (check1 == '[' || check1 == '{' || check1 == '(') {
                link.push(check1);
            } else {
                if (link.isEmpty()) {
                    return false;
                }
                if (check1 == ')' && link.top() == '(') {
                    link.pop();
                } else if (check1 == ']' && link.top() == '[') {
                    link.pop();
                } else if (check1 == '}' && link.top() == '{') {
                    link.pop();
                } else {
                    return false;
                }
            }
        }
        return link.isEmpty();
    }
}
/**
Stack class.
 **/
class LinkedStackOfStrings {
    /**
     Node object first.
     **/
    private Node first = null;
    /**
     class node for the linked list.
     **/
    private class Node {
        /**
         char item.
         **/
        private char item;
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
     * @param item char.
     **/
    public void push(final char item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    /**
     * used to pop the item from the stack.
     * @return string pop
     **/
    public char pop() {
        char item = first.item;
        first = first.next;
        return item;
    }
    /**
     used to check the item on the top.
     * @return first item.
     **/
    public char top() {
        return first.item;
    }
}