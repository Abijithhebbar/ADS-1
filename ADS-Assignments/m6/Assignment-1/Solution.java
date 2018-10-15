import java.util.Scanner;
/**
 add large number class.
 **/
final class AddLargeNumbers {
    /**
     * default constructor.
     **/
    private AddLargeNumbers() {

    }
/**
 * number To digit.
 * @param number obj.
 * @return obj.
 **/
    public static LinkedList numberToDigits(final String number) {
        LinkedList numberToDigits = new LinkedList();
        for (int i = number.length() - 1; i >= 0; i--) {
            String elementConverstion = "" + number.charAt(i);
            numberToDigits.push(Integer.parseInt(elementConverstion));
        }
        return numberToDigits;
    }
/**
 * digits to string.
 * @param list obj.
 * @return string.
 */
    public static String digitsToNumber(final LinkedList list) {
        return list.toString();
    }
/**.
 add large numbers
 * @param list1 obj.
 * @param list2 obj.
 *
 * @return object.
 **/
    public static LinkedList addLargeNumbers(final LinkedList list1,
     final LinkedList list2) {
        LinkedList result = new LinkedList();
        int a, c = 0, b = 0, count = 0;
        final int ten = 10, nine = 9;
        while (!list1.isEmpty()) {
        	while (!list2.isEmpty()) {
        		a = list1.pop() + list2.pop() + b;
        		c = a % 10;
        		result.push(c);
        		b = a / 10;

        	}
        }
        if (c == 1) {
        	result.push(c);
        }
        return result;
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
      main method.
      * @param args String.
      **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
            System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
            break;

        case "addLargeNumbers":
            pDigits = AddLargeNumbers.numberToDigits(p);
            qDigits = AddLargeNumbers.numberToDigits(q);
            LinkedList result = AddLargeNumbers.addLargeNumbers(
                pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        default :
        break;
        }
    }

}
