import java.util.Scanner;
/**
 * Solution class.
 **/
 final class Solution {
 	/**
 	 * default constructor.
 	 **/
 	private Solution() {

 	}
 	/**
 	 * Main method.
 	 * @param arg String type.
 	 **/
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int students = Integer.parseInt(sc.nextLine());
        int seats = Integer.parseInt(sc.nextLine());
        int openSeats = Integer.parseInt(sc.nextLine());
        int bcSeats = Integer.parseInt(sc.nextLine());
        int scSeats = Integer.parseInt(sc.nextLine());
        int stSeats = Integer.parseInt(sc.nextLine());
        // sc.close();
        int size = 0;
        Scanner in = new Scanner(System.in);
        Table t = new Table();
        final int three = 3, four = 4, five = 5, six =6;
        Team[] teams = new Team[students];
        for (int i = 0; i < students; i++) {
        	String lines = sc.nextLine();
        	// String[] line = new String[7];
        	// line = lines.split(",");
            // String[] line = in.nextLine().split(",");
            // teams[i] = new Team(line[0], line[1],
            // 	Integer.parseInt(line[2]), Integer.parseInt(line[three]),
            // Integer.parseInt(line[four]), Integer.parseInt(line[five]),
            // line[six]);
            teams[i] = new Team(lines);
        }
        t.leaderboard(teams, size, openSeats, bcSeats, scSeats, stSeats);

 	}
 }