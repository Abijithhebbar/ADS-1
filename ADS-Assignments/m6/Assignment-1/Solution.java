import java.util.Scanner;
class AddLargeNumbers {

    public static LinkedList numberToDigits(final String number) {
        LinkedList numberToDigits = new LinkedList();
        for(int i = number.length()-1; i >= 0; i--) {
            String elementConverstion = "" + number.charAt(i);
            numberToDigits.push(Integer.parseInt(elementConverstion));
        }
        return numberToDigits;
    }

    public static String digitsToNumber(final LinkedList list) {
        return list.toString();
    }

    // public static LinkedList addLargeNumbers(final LinkedList list1, final LinkedList list2) {

    // }
}
/**
 * solution class.
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            // case "addLargeNumbers":
            //     pDigits = AddLargeNumbers.numberToDigits(p);
            //     qDigits = AddLargeNumbers.numberToDigits(q);
            //     LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
            //     break;
        }
    }

}
