import java.util.Scanner;
/**
 * Solution class.
 */
 final class Solution {
 	/**
 	 * default constructor.lified
 	 */
 	private Solution() {

 	}
 	/**
 	 * main method.
 	 * @param args String.
 	 */
 	public static void main(final String[] args) {
 		Scanner scan = new Scanner(System.in);
 		int qualified = Integer.parseInt(scan.nextLine());
 		Studentinfo[] students = new Studentinfo[qualified];
 		int vacancies = Integer.parseInt(scan.nextLine());
 		int unreserved = Integer.parseInt(scan.nextLine());
 		int bc = Integer.parseInt(scan.nextLine());
 		int sc = Integer.parseInt(scan.nextLine());
 		int st = Integer.parseInt(scan.nextLine());
 		for (int i = 0; i < qualified; i++) {
 			String input = scan.nextLine();
 			Studentinfo eachStudent = new Studentinfo(input);
 			students[i] = eachStudent;
 		}
 		Sorting heap = new Sorting();
        heap.sort(students);
        heap.toString(students);
        System.out.println();
        heap.mertiList(students, vacancies, unreserved,
            bc, sc, st);
 	}
 }