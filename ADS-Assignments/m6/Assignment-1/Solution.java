import java.util.Scanner;
/**
*this class adds the large numbers.
*/
final class AddLargeNumbers {
    /**
    *A deafult constructor.
    */
    private AddLargeNumbers() {
    }
    /**
    *This method reverse's the numbers and Stroe in digits from and retuns.
    *@param number input is given in the form of number.
    *@return numbers in from of digits.
    */
    public static LinkedList numberToDigits(final String number) {
        LinkedList numberToDigits = new LinkedList();
        for (int i = number.length() - 1; i >= 0; i--) {
            String digitConverstion = "" + number.charAt(i);
            numberToDigits.push(Integer.parseInt(digitConverstion));
        }
        return numberToDigits;
    }
    /**
    *this methods retruns the converstion from digits to Number.
    *@param list sends the LinkedList.
    *@return list.
    */
    public static String digitsToNumber(final LinkedList list) {
        return list.toString();
    }
    /**
    *This method should help the adding both the lists.
    */
    public static LinkedList addLargeNumbers(final LinkedList list1,
        final LinkedList list2) {
        LinkedList result = new LinkedList();
        Check check = new Check();
        if (list1.size() == list2.size()) {
            result = check.refer(list1, list2);
        }
    return result;
    }
}
/**
*This class is used to read the input.
*/
public final class Solution {
    /**
    *A daefult constructor.
    */
    private Solution() {
    }
    /**
    *main method is used to read the inut from the test cases.
    @param args arguments.
    */
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
                LinkedList result =
                AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
            default:
                    break;
        }
    }
}