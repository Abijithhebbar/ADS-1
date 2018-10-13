/**
 * Solution file for the given program.
 */
 import java.util.Scanner;
 /**
  * Solution class.
  */
  final class Solution {
  	/**
  	 * Default constructor.
  	 */
  	private Solution() {

  	}
  	/**
  	 * Main method of the solution class.
  	 * @param args String type.
  	 */
  	public static void main(final String[] args) {
  	Scanner sc = new Scanner(System.in);
  	int n = Integer.parseInt(sc.nextLine());
  	Search search = new Search(n);
  	for (int i = 0; i < n; i++) {
  		String s = sc.nextLine();
  		String[] lines = s.split(",");
  		float value = Float.parseFloat(lines[1]);
  		search.put(value, lines[0]);
  	}
  	// System.out.println("");
  	System.out.println(search.max());
  	for (int i = 0; i < 4; i++) {
  		System.out.println(search.max(i));
  	}
  	System.out.println(" ");

  	for (int i = 0; i < 5; i++) {
  		System.out.println(search.min());
  		search.deleteMin();
  	}
  	for (int i = 0; i < n; i++) {
  		String s = sc.nextLine();
  		String[] lines = s.split(",");
  		float value = Float.parseFloat(lines[1]);
  		search.put(value, lines[0]);
  	}
  	System.out.println("");
  	System.out.println(search.max());
  	for (int i = 0; i < 4; i++) {
  		System.out.println(search.max(i));
  	}
  	System.out.println(" ");

  	for (int i = 0; i < 5; i++) {
  		System.out.println(search.min());
  		search.deleteMin();
  	}
  	for (int i = 0; i < n; i++) {
  		String s = sc.nextLine();
  		String[] lines = s.split(",");
  		float value = Float.parseFloat(lines[1]);
  		search.put(value, lines[0]);
  	}
  	System.out.println("");
  	System.out.println(search.max());
  	for (int i = 0; i < 4; i++) {
  		System.out.println(search.max(i));
  	}
  	System.out.println(" ");

  	for (int i = 0; i < 5; i++) {
  		System.out.println(search.min());
  		search.deleteMin();
  	}
  	for (int i = 0; i < n; i++) {
  		String s = sc.nextLine();
  		String[] lines = s.split(",");
  		float value = Float.parseFloat(lines[1]);
  		search.put(value, lines[0]);
  	}
  	System.out.println("");
  	System.out.println(search.max());
  	for (int i = 0; i < 4; i++) {
  		System.out.println(search.max(i));
  	}
  	System.out.println(" ");

  	for (int i = 0; i < 5; i++) {
  		System.out.println(search.min());
  		search.deleteMin();
  	}
  	for (int i = 0; i < n; i++) {
  		String s = sc.nextLine();
  		String[] lines = s.split(",");
  		float value = Float.parseFloat(lines[1]);
  		search.put(value, lines[0]);
  	}
  	System.out.println("");
  	System.out.println(search.max());
  	for (int i = 0; i < 4; i++) {
  		System.out.println(search.max(i));
  	}
  	System.out.println(" ");

  	for (int i = 0; i < 5; i++) {
  		System.out.println(search.min());
  		search.deleteMin();
  	}
  	for (int i = 0; i < n; i++) {
  		String s = sc.nextLine();
  		String[] lines = s.split(",");
  		float value = Float.parseFloat(lines[1]);
  		search.put(value, lines[0]);
  	}
  	System.out.println("");
  	System.out.println(search.max());
  	for (int i = 0; i < 4; i++) {
  		System.out.println(search.max(i));
  	}
  	System.out.println(" ");

  	for (int i = 0; i < 5; i++) {
  		System.out.println(search.min());
  		search.deleteMin();
  	}
  	}
  }