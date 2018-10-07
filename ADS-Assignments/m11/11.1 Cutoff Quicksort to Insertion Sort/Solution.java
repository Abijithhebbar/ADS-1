import java.util.Scanner;
/**
 * Solution class.
 */
public final class Solution {
    /**
     * default private and unused constructor.
     */
    private Solution() { }
    /**
     *main method.
     *complexity is N.
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        SortMethod sort = new SortMethod();
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            int j = Integer.parseInt(sc.nextLine());
            String line = sc.nextLine();
            String[] lines = line.split(" ");
            if (lines[0].equals("")) {
                System.out.println("[]");
            } else {
                sort.sort(lines, j);
                System.out.println(sort.toString(lines));
            }
        }
    }
}
