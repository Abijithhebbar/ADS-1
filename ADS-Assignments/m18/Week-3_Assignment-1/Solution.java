import java.util.Scanner;
/**
 * Class for List.
 */
class List implements Comparable<List> {
    /**
     * String listname.
     */
    private String listname;
    /**
     * float listchange.
     */
    private float listchange;
    /**
     *Constructor.
     * @param      name   String type.
     * @param      change  float type.
     */
    List(final String name, final float change) {
        this.listname = name;
        this.listchange = change;
    }
    /**
     * it is used to get the List name.
     * @return name.
     */
    public String getlistname() {
        return this.listname;
    }
    /**
     * getlistchange method.
     * @return float value.
     */
    public float getlistchange() {
        return this.listchange;
    }
    /**
     *
     * @param      other List type.
     *
     * @return     an integer 1 or -1 or 0.
     */
    public int compareTo(final List other) {
        if (this.listchange > other.listchange) {
            return 1;
        }
        if (this.listchange < other.listchange) {
            return -1;
        }
        if (this.listname.compareTo(other.listname) > 0) {
            return 1;
        }
        if (this.listname.compareTo(other.listname) < 0) {
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
        str = str + this.listname + " " + this.listchange;
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
        int listlength = Integer.parseInt(sc.nextLine());
        final int six = 6;
        final int five = 5;
        for (int i = 0; i < six; i++) {
            int count = 0;
            MinPQ<List> minobj = new MinPQ<>();
            MaxPQ<List> maxobj = new MaxPQ<>();
            while (count < listlength) {
                String[] input = sc.nextLine().split(",");
                List listobj = new List(input[0],
                    Float.parseFloat(input[1]));
                minobj.insert(listobj);
                maxobj.insert(listobj);
                count++;
            }
            Search<String, Float> topCompany
            = new  Search<>();
            for (int j = 0; j < five; j++) {
                List topCompanyMaxPq = maxobj.delMax();
                System.out.println(topCompanyMaxPq);
                topCompany.put(topCompanyMaxPq.getlistname(),
                    topCompanyMaxPq.getlistchange());
            }
            System.out.println();
            Search<String, Float> leastCompany
            = new Search<>();
            for (int k = 0; k < five; k++) {
                List leastCompanyMinPq = minobj.delMin();
                System.out.println(leastCompanyMinPq);
                repetitions(leastCompanyMinPq, k);
                leastCompany.put(leastCompanyMinPq.getlistname(),
                    leastCompanyMinPq.getlistchange());
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
                // System.out.println(repetitions(input2[1], 1));
                    break;
                default:
                    break;
            }
        }
    }
/**
 used to check the repetitions for the test cases.
 * @param S List type.
 * @param i int type.
 *
 * @return count.
 */
public static int repetitions(final List s, final int i) {
    final int six =6;
    List[] str = new List[six];
    str[i] = s;
    int count = 0;
    for (int j = 0; j < 6; j++) {
        if (s.equals(str[i])) {
            count++;
        }
    }
    return count;
}
}
