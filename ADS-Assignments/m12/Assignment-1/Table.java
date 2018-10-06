import java.util.Arrays;
/**
 * Class for table.
 */
public class Table {
    /**
     * default constructor.
     */
    public Table() {

    }
    /**
     * Insertion Sort function for array.
     * complexity is N^2 for big O.
     * for Theta it is N^2.
     * @param      array  The array
     * @param      size   The size
     */
    public void Sort(Comparable[] array, int size, int openSeats, int bcSeats, int scSeats, int stSeats) {
        // int n = size;
        // for (int i = 0; i < n; i++) {
        //     int min = i;
        //     for (int j = i + 1; j < n; j++) {
        //         if (more(array, i, j)) {
        //             swap(array, j, min);
        //         }
        //     }
        // }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        int n = array.length - 1;
        System.out.println();
        for (int i = array.length - 1; i > (n - openSeats); i--) {
            System.out.println(array[i]);
        }
        // int x = n - openSeats;
        // int count = 0;
        // for (int i = x; count  == bcSeats; i--) {
        //     Comparable[] bc = new Comparable[x];
        //     bc = array[i];
        //     // bc = z.split(",");
        //     if (bc[2] == "BC") {
        //         System.out.println(array[i]);
        //         count++;
        //     }
        // }
        // int sccount = 0;
        // for (int i = x; sccount  == scSeats; i--) {
        //     Comparable[] sc = new Comparable[x];
        //     sc = array[i];
        //     // String z = array[i];
        //     // String sc = z.split(",");
        //     if (sc[2] == "SC") {
        //         System.out.println(array[i]);
        //         sccount++;
        //     }
        // }
        // int stcount = 0;
        // for (int i = x; stcount  == stSeats; i--) {
        //     Comparable[] st = new Comparable[x];
        //     st = array[i];
        //     // String z = array[i];
        //     // st = z.;
        //     if (st[2] == "ST") {
        //         System.out.println(array[i]);
        //         stcount++;
        //     }
        // }


        // System.out.println(array[0]);
        // System.out.println("abcder");
        // for (int i = 0; i < n; i++) {
        //     System.out.println(array[i]);
        // }
    }
    /**
     * Finds which value is lower.
     *
     * @param      arr   The arr
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     *
     * @return     { description_of_the_return_value }
     */
    public boolean more(Comparable[] arr, int ind1, int ind2) {
        return arr[ind1].compareTo(arr[ind2]) > 0;
    }
    /**
     * Swaps the values in the array.
     *
     * @param      a     Team array
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     */
    public void swap(Comparable[] a, int ind1, int ind2) {
        Comparable temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
    /**
     * Finds the Leaderboard and returns leaderboard string.
     *
     * @param      array  The array
     * @param      size   The size
     *
     * @return     String with team names.
     */
    public void leaderboard(Comparable[] array, int size, int openSeats, int bcSeats, int scSeats, int stSeats) {
        Sort(array, size, openSeats, bcSeats, scSeats, stSeats);
        // String s = "";
        // return s;
        // for (int i = 0; i < size; i++) {
        //     s += array[i].toString() + ",";
        // }
        // return s.substring(0, s.length());
    }
}
