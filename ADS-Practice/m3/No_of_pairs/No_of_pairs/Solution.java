import java.util.Scanner;
import java.util.Arrays;
/**
 class solution.
 **/
final class Solution {
    /**
     default constructor.
     **/
    private Solution() {

    }
    /**
     * @param args String[].
     **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] arr;
        int count = 1;
        int total = 0;
        num = Integer.parseInt(sc.nextLine());
        arr = new int[num];
        // int i = 0;
        // while(sc.hasNextLine()) {
        //  arr[i] = Integer.parseInt(sc.nextLine());
        //  i++;
        //}
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        // num = arr.length;
        for (int i = 1; i < num; i++) {
            if (arr[i] == arr[i - 1]) {
                count += 1;
            } else {
                total = total + count * (count - 1) / 2;
                count = 1;
            }
        }
        total = total + count * (count - 1) / 2;
        System.out.println(total);
// System.out.println(count);
    }
}