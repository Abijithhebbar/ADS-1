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

    public static String digitsToNumber(LinkedList list) {
String s = "";
return s;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
LinkedList newli = new LinkedList();
return newli;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                String pDigits = AddLargeNumbers.numberToDigits(p);
                String qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.numberToDigits(pDigits));
                System.out.println(AddLargeNumbers.numberToDigits(qDigits));
                break;

            case "addLargeNumbers":
                // pDigits = AddLargeNumbers.numberToDigits(p);
                // qDigits = AddLargeNumbers.numberToDigits(q);
                // LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                // System.out.println(AddLargeNumbers.digitsToNumber(result));
                // break;
        }
    }

}
