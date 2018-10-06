import java.util.Scanner;
/**
Solution class
*/
 final class Solution {
    /**
    *default constructor.
    */
    private Solution() {
    }
    /**
    main.
    *@param args String type.
    */
    public static void main(final String[] args) {
        Scanner scan =  new Scanner(System.in);
        final int n = Integer.parseInt(scan.nextLine());
        StudentData[] students = new StudentData[n];
        final int seatsAvailable = Integer.parseInt(scan.nextLine());
        final int openCat = Integer.parseInt(scan.nextLine());
        final int bcCat = Integer.parseInt(scan.nextLine());
        final int scCat = Integer.parseInt(scan.nextLine());
        final int stCat = Integer.parseInt(scan.nextLine());
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            String[] tokens = line.split(",");
            StudentData eachStudentInfo =
            new StudentData(tokens[0], tokens[1],
                    Integer.parseInt(tokens[2]),
                    Integer.parseInt(tokens[three]),
                    Integer.parseInt(tokens[four]),
                    Integer.parseInt(tokens[five]), tokens[six]);
            students[i] = eachStudentInfo;
        }
        Sorting insertion = new Sorting();
        insertion.sort(students);
        insertion.toString(students);
        System.out.println();
        insertion.mertiList(students, seatsAvailable, openCat,
            bcCat, scCat, stCat);
    }

}
