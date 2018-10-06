class Sorting {
    /**
    *exchange method is used to exchange the values after there are sorted.
    *@param a student data.
    *@param i first value to be exchange.
    *@param j second value to be exchnaged.
    */
    public void exchange(final StudentData[] a, final int i, final int j) {
        StudentData temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    /**
    *less method is used to compare which of the two are less.
    *@param std1 student data 1.
    *@param std2 student data 2.
    *@return returns a boolean value.
    */
    public boolean less(final StudentData std1, final StudentData std2) {
        return std1.compareTo(std2) == -1;
    }
    /**
    *Insertion sort code to sort the students.
    *@param students students data in array format.
    */
    public void sort(final StudentData[] students) {
        for (int i = 1; i < students.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(students[j - 1], students[j])) {
                    exchange(students, j - 1, j);
                } else {
                    break;
                }
            }
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
    public static void mertiList(final StudentData[] a, int seatAvailable, int openCat,
        int bcCat, int scCat, int stCat) {
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
    public static void toString(final StudentData[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].studentName + ","
                + a[i].totalMarks + ","
                + a[i].cato);
        }
    }

}