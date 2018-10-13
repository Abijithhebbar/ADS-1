import java.util.Scanner;
/**
 * Class for list.
 */
class list implements Comparable<list> {
    /**
     * String listName
     */
    private String listName;
    /**
     * float ListChange.
     */
    private float listChange;
    /**
     *Constructor.
     * @param      name   String type.
     * @param      change  float type.
     */
    list(final String name, final float change) {
        this.listName = name;
        this.listChange = change;
    }
    /**
     * it is used to get the list name.
     * @return name.
     */
    public String getlistname() {
        return this.listName;
    }
    /**
     * getlistChange method.
     * @return float value.
     */
    public float getlistchange() {
        return this.listChange;
    }
    /**
     *
     * @param      other list type.
     *
     * @return     an integer 1 or -1 or 0.
     */
    public int compareTo(final list other) {
        if (this.listChange > other.listChange) {
            return 1;
        }
        if (this.listChange < other.listChange) {
            return -1;
        }
        if (this.listName.compareTo(other.listName) > 0) {
            return 1;
        }
        if (this.listName.compareTo(other.listName) < 0) {
            return -1;
        }
        return 0;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return string which is used to print.
     */
    public String toString() {
        String inputStr = "";
        inputStr = inputStr + this.listName + " " + this.listChange;
        return inputStr;
    }
}
/**
 * Class for solution.
 */
final class Solution {
    /**
    default constructor.
     */
    private Solution() {
    }
    /**
     *Main method.
     * @param      args  String type.
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int listLength = Integer.parseInt(scan.nextLine());
        final int six = 6;
        final int five = 5;
        for (int i = 0; i < six; i++) {
            int count = 0;
            MinPQ<list> minobj = new MinPQ<>();
            MaxPQ<list> maxobj = new MaxPQ<>();
            while (count < listLength) {
                String[] input = scan.nextLine().split(",");
                list listObj = new list(input[0],
                    Float.parseFloat(input[1]));
                minobj.insert(listObj);
                maxobj.insert(listObj);
                count++;
            }
            BinarySearchTree<String, Float> bestPerformer
            = new  BinarySearchTree<>();
            for (int j = 0; j < five; j++) {
                list maxpqBest = maxobj.delMax();
                System.out.println(maxpqBest);
                bestPerformer.put(maxpqBest.getlistname(),
                    maxpqBest.getlistchange());
            }
            System.out.println();
            BinarySearchTree<String, Float> worstPerformer
            = new BinarySearchTree<>();
            for (int k = 0; k < five; k++) {
                list minpqWorst = minobj.delMin();
                System.out.println(minpqWorst);
                worstPerformer.put(minpqWorst.getlistname(),
                    minpqWorst.getlistchange());
            }
            System.out.println();
        }
    }
}
