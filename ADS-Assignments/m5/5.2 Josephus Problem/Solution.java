import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < num; i++) {
            Operations op = new Operations();
            String stringJosephus = scan.nextLine();
            String[] josephus1 = stringJosephus.split(" ");
            int x = Integer.parseInt(josephus1[0]);
            int y = Integer.parseInt(josephus1[1]);
            for (int j = 0; j < x; j++) {
                op.pushAtend(j);
            }
            int[] josephusArray = op.joseph(y, x);
            for (int p = 0; p < josephusArray.length - 1; p++) {
                System.out.print(josephusArray[p] + " ");
            }
            System.out.println(josephusArray[josephusArray.length - 1]);
        }
    }
}
