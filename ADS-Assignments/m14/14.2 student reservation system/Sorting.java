import java.util.*;
class Sorting {
    /**
    *exchange method is used to exchange the values after there are sorted.
    *@param a student data.
    *@param i first value to be exchange.
    *@param j second value to be exchnaged.
    */
     private static void sink(final Studentinfo[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) {
                j++;
            }
            if (!less(pq, k, j)) {
                break;
            }
            exch(pq, k, j);
            k = j;
        }
    }
    /**
    *less method is used to compare which of the two are less.
    *@param std1 student data 1.
    *@param std2 student data 2.
    *@return returns a boolean value.
    */
     private static boolean less(final Studentinfo[] pq, int i, int j) {
        return pq[i-1].compareTo(pq[j-1]) < 0;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = swap;
    }
    /**
    *Insertion sort code to sort the students.
    *@param students students data in array format.
    */
   public static void sort(final Studentinfo[] pq) {
        int n = pq.length;
        for (int k = n/2; k >= 1; k--)
            sink(pq, k, n);
        while (n > 1) {
            exch(pq, 1, n--);
            sink(pq, 1, n);
        }
    }

    /**
    *mert list method where in the students are
    *divided according to the marks and the reservation.
    *@param a Student data type.
    *@param seatAvailable inrteger type.
    *@param openCat integer type.
    *@param bcCat integer type.
    *@param scCat integer type.
    *@param stCat integer type.
    */
    public static void mertiList(final Studentinfo[] a, int seatAvailable, int openCat,
        int bcCat, int scCat, int stCat) {
        Collections.reverse(Arrays.asList(a));
        for (int i = 0; i < a.length && seatAvailable > 0; i++) {
            if (openCat > 0) {
                System.out.println(a[i].studentName + ","
                    + a[i].totalMarks + ","
                    + a[i].cato);
                openCat--;
            } else if (a[i].cato.equals("BC")
                || a[i].cato.equals("SC")
                || a[i].cato.equals("ST")) {
                if (a[i].cato.equals("BC") && bcCat > 0) {
                    System.out.println(a[i].studentName + ","
                        + a[i].totalMarks + ","
                        + a[i].cato);
                    bcCat--;
                } else if (a[i].cato.equals("SC") && scCat > 0) {
                    System.out.println(a[i].studentName + ","
                        + a[i].totalMarks + ","
                        + a[i].cato);
                    scCat--;
                } else if (a[i].cato.equals("ST") && stCat > 0) {
                    System.out.println(a[i].studentName + ","
                        + a[i].totalMarks + ","
                        + a[i].cato);
                    stCat--;
                }
            }
        }
        seatAvailable--;
    }
    /**
    *To string method which convterts to String type.
    *@param a Student data type.
    */
    public static void toString(final Studentinfo[] a) {
        Collections.reverse(Arrays.asList(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].studentName + ","
                + a[i].totalMarks + ","
                + a[i].cato);
        }
    }

}