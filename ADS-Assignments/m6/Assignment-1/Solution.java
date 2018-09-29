import java.util.Scanner;
class AddLargeNumbers {

    public static String numberToDigits(String number) {
        LinkedList newlist = new LinkedList();
        // LinkedList list = new LinkedList();
        newlist.push(number);
        // while (!newlist.isEmpty()) {
        //     list = newlist.pop();
        // }
        // System.out.println(newlist.displayAll());
        return newlist.displayAll();
    }

    public static String digitsToNumber(String list) {
        String s = "";
        return s;
    }

    public static String addLargeNumbers(String list1, String list2) {
        // LinkedList add = new LinkedList();
        // LinkedList add1 = new LinkedList();
        // add.push(list1);
        // add1.push(list2);
        long a = Long.parseLong(list1);
        long b = Long.parseLong(list2);
        long c = a + b;
        String result = c + "";
        return result;


    }
}

public class Solution {
    public static void main(String[] args) {
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
        }
    }

}
