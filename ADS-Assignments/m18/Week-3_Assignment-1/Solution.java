import java.util.Scanner;
/**
 * Class for List.
 */
class List implements Comparable<List> {
    /**
     * String ListName.
     */
    private String ListName;
    /**
     * float ListChange.
     */
    private float ListChange;
    /**
     *Constructor.
     * @param      name   String type.
     * @param      change  float type.
     */
    List(final String name, final float change) {
        this.ListName = name;
        this.ListChange = change;
    }
    /**
     * it is used to get the List name.
     * @return name.
     */
    public String getListname() {
        return this.ListName;
    }
    /**
     * getListChange method.
     * @return float value.
     */
    public float getListchange() {
        return this.ListChange;
    }
    /**
     *
     * @param      other List type.
     *
     * @return     an integer 1 or -1 or 0.
     */
    public int compareTo(final List other) {
        if (this.ListChange > other.ListChange) {
            return 1;
        }
        if (this.ListChange < other.ListChange) {
            return -1;
        }
        if (this.ListName.compareTo(other.ListName) > 0) {
            return 1;
        }
        if (this.ListName.compareTo(other.ListName) < 0) {
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
        String str = "";
        str = str + this.ListName + " " + this.ListChange;
        return str;
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
        Scanner sc = new Scanner(System.in);
        int ListLength = Integer.parseInt(sc.nextLine());
        final int six = 6;
        final int five = 5;
        for (int i = 0; i < six; i++) {
            int count = 0;
            MinPQ<List> minobj = new MinPQ<>();
            MaxPQ<List> maxobj = new MaxPQ<>();
            while (count < ListLength) {
                String[] input = sc.nextLine().split(",");
                List ListObj = new List(input[0],
                    Float.parseFloat(input[1]));
                minobj.insert(ListObj);
                maxobj.insert(ListObj);
                count++;
            }
            Search<String, Float> topCompany
            = new  Search<>();
            for (int j = 0; j < five; j++) {
                List topCompanyMaxPq = maxobj.delMax();
                System.out.println(topCompanyMaxPq);
                topCompany.put(topCompanyMaxPq.getListname(),
                    topCompanyMaxPq.getListchange());
            }
            System.out.println();
            Search<String, Float> leastCompany
            = new Search<>();
            for (int k = 0; k < five; k++) {
                List leastCompanyMinPq = minobj.delMin();
                System.out.println(leastCompanyMinPq);
                leastCompany.put(leastCompanyMinPq.getListname(),
                    leastCompanyMinPq.getListchange());
            }
            System.out.println();
        }
        int last = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < last; i++) {
            String[] input2 = sc.nextLine().split(",");
            switch (input2[1]) {
                case "maxST":
                    break;
                case "minST":
                    break;
                default:
                    break;
            }
        }
    }

// public void repetitions(String s) {
//  String[] str = new String[5];
// }
}
