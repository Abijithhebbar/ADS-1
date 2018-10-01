import java.util.Scanner;
/**
 Solution class.
 **/
final class Solution {
    /**
     * default constructor.
     **/
    private Solution() {

    }
    /**
     * Main function.
     * Here we create an object for the Linked List class.
     * The methods of PushAtStart with the parameter item is passed to push
     * at the start.
     * The methods of PushAtEnd with the parameter item is passed to push
     * at the End.
     * The pop method is used to pop the item from the stack.
     * The displayAll method is used to display the elements in the Stack.
     * @param args String.
     **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            LinkedList link = new LinkedList();
            while (sc.hasNext()) {
                String s = sc.nextLine();
                if (s == "\n") {
                    break; //return;
                } else {
                String[] check = s.split(" ");
                switch (check[0]) {
                    case "push":
                    link.pushAtStart(Integer.parseInt(check[1]));
                    System.out.println(link.displayAll());
                    break;
                    case "pop":
                    link.popAtStart();
                    System.out.println(link.displayAll());
                    break;
                    case "enqueue":
                    link.pushAtEnd(Integer.parseInt(check[1]));
                    System.out.println(link.displayAll());
                    break;
                    default:
                    break;
                }
                if (check[0].equals("")) {
                    System.out.println();
                    break;
                }
            }
            // link.displayAll();
            }

            }
        }
    }

