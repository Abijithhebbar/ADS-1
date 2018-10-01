import java.util.Scanner;
/**
 Solution class.
 **/
final class Solution {
	/**
	 * default constructor.
	 **/
	private Solution() {

	}
	/**
	 * Main function.
	 * @param args String.
	 **/
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				if (s == "\n") {
					break; //return;
				} else {
				String[] check = s.split(" ");
				switch(check[0]) {
					case "push":
					link.pushAtStart(Integer.parseInt(check[1]));
					break;
					case "pop":
					link.popAtStart();
					break;
					case "enqueue":
					link.pushAtEnd(Integer.parseInt(check[1]));
					break;
					default:
					break;
				}
			}
			link.displayAll();
			}
		}
	}

}