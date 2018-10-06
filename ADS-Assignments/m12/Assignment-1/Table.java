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
    public void Sort(Comparable[] array, int size) {
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
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
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
    public String leaderboard(Comparable[] array, int size) {
        Sort(array, size);
        String s = "";
        return s;
        // for (int i = 0; i < size; i++) {
        //     s += array[i].toString() + ",";
        // }
        // return s.substring(0, s.length());
    }
}
