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

