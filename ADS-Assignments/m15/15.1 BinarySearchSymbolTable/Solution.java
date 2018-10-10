import java.util.Scanner;
/**
 * Solution class.
 */
final class Solution {
    /**
     * default constructor.
     */
    private Solution() {

    }
    /**
     * Main method.
     * @param args String.
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Search search = new Search(input.length);
        for (int i = 0; i < input.length; i++) {
            search.put(input[i], i);
        }
        while (sc.hasNext()) {
            String[] inp = sc.nextLine().split(" ");
            switch (inp[0]) {
            case "max":
                System.out.println(search.max());
                break;
            case "floor":
                System.out.println(search.floor(inp[1]));
                break;
            case "contains":
                System.out.println(search.contains(inp[1]));
                break;
            case "get":
                System.out.println(search.get(inp[1]));
                break;
            case "keys":
                search.keys();
                break;
            case "rank":
                System.out.println(search.rank(inp[1]));
                break;
            case "deleteMin":
                search.deleteMin();
                break;
            default:
                break;
            }
        }
    }
}
