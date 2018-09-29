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

    public static LinkedList addLargeNumbers(final LinkedList list1, final LinkedList list2) {
        LinkedList result = new LinkedList();
        int a, c = 0, b = 0;
        // a = list1.pop();
        // result.push(a);
        // int b = list2.pop();
        // result.push(b);
        while (!list1.isEmpty()) {
            // a = 0;
            while (!list2.isEmpty()) {
                a = list1.pop() + list2.pop() + b;
                 // c = 0;
                if (a > 9) {
                    c = a % 10;
                    b = a / 10;
                    // System.out.println(a);
                    // System.out.println(b);
                    // System.out.println(c);
                    result.push(c);


                }
                else {
                    // a = a + b;
                    // System.out.print(a);
                    result.push(a);                }

            }
        }
        return result;
    }
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

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }

}
