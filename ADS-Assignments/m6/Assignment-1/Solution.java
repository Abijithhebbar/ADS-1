import java.util.Scanner;
/**
 * class to add large numbers.
 **/
class AddLargeNumbers {
/**
 * numbers to digits string.
 * @param number string.
 * @return list output in the form of string.
 */
    public static String numberToDigits(final String number) {
        LinkedList newlist = new LinkedList();
        // LinkedList list = new LinkedList();
        newlist.push(number);
        // while (!newlist.isEmpty()) {
        //     list = newlist.pop();
        // }
        // System.out.println(newlist.displayAll());
        return newlist.displayAll();
    }
/**
 * digits to numbers.
 * @param list string.
 * @return string.
 */
    public static String digitsToNumber(final String list) {
        String s = "";
        return s;
    }
/**
 * add large numbers method.
 * @param list1 String.
 * @param list2 String.
 * @return sum of the numbers.
 **/
    public static String addLargeNumbers(final String list1, final String list2) {
        // LinkedList add = new LinkedList();
        // LinkedList add1 = new LinkedList();
        // add.push(list1);
        // add1.push(list2);
        long a = Long.parseLong(list1);
        long b = Long.parseLong(list2);
        long c = a + b;
        String result = c + "";
        return result;
        // LinkedList add = new LinkedList();
        // LinkedList add1 = new LinkedList();
        // add.push(list1);
        // add1.push(list2);
        // String res1 = "";
        // LinkedList result = new LinkedList();
        // while (!add.isEmpty()) {
        //     int res = 0;
        //     while (!add1.isEmpty()) {
        //        res = add.pop() + add1.pop();
        //        res1 += res;
        //     }
        // }
        // result.push(res1);
        // return result.displayAll();

    }
}
/**
 * solution class.
 **/
final class Solution {
    /**
     default constructor.
     **/
     private Solution() {

     }
     /**
      * main method.
      * @param args String.
      **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            String pDigits = AddLargeNumbers.numberToDigits(p);
            String qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(AddLargeNumbers.numberToDigits(pDigits));
            System.out.println(AddLargeNumbers.numberToDigits(qDigits));
            break;

        case "addLargeNumbers":
            pDigits = AddLargeNumbers.numberToDigits(p);
            qDigits = AddLargeNumbers.numberToDigits(q);
            String result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            System.out.println(result);
            break;
        default :
        break;
        }
    }

}
