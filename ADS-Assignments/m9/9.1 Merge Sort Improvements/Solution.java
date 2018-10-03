import java.util.Scanner;
/**
 * class Solution.
 */
 final class Solution {
    /**
     * default constructor.
     */
    private Solution() {

    }
    /**
     * main method.
     * here the input string is passed.
     * the input is passed to the Mergesort method where the sorting
     * takes place.
     * @param args String.
     */
    public static void main(final String[] args) {
        Mergesort merge = new Mergesort();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] lines = line.split(",");
            merge.sort(lines);
            System.out.println(merge.display(lines));
            System.out.println();
        }
    }
 }