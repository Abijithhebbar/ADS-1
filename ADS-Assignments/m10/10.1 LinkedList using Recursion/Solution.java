import java.util.Scanner;
/**
 Solution class.
 **/
final class Solution {
    /**
     default constructor.
     **/
    private Solution() {

    }
    /**
     * main method.
     * this method is used to execute the linked list with the recurssion.
     * @param args [description]
     **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (sc.hasNextLine()) {
            String[] values = sc.nextLine().split(" ");
            switch (values[0]) {
            case "insertAt":
                try {
                    ll.insertAt(Integer.parseInt(values[1]),
                        new Node(values[2]));
                    ll.display();
                }

                catch (Exception e) {
                    System.out.println("Can't insert at this position.");

                }
                break;
            case "reverse":
                try {
                    ll.reverse();
                    ll.display();
                }

                catch (Exception e) {
                    System.out.println("No elements to reverse.");
                }
                break;
                default:
                break;

            }
        }
    }
}