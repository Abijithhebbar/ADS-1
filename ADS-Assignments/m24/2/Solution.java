/**
 Solution file.
 */
import java.util.Scanner;
public final class Solution {
    /**
     default constructor.
     */
    private Solution() {

    }
    /**
     * Main method.
     * @param String [description]
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int inp = Integer.parseInt(scan.nextLine());
        BinarySearchTree<Student, Integer> bst =
        new BinarySearchTree<>();
        Student obj;
       for (int i = 0; i < inp; i++) {
            String[] num = scan.nextLine().split(",");
            obj = new Student(num[1], num[2], num[0]);
            bst.put(obj, Integer.parseInt(num[0]));
        }
        int out = Integer.parseInt(scan.nextLine());
        for (int j = 0; j < out; j++) {
            String[] strout = scan.nextLine().split(" ");
            switch (strout[0]) {
                case "BE" :
                double marks1 = Double.parseDouble(strout[1]);
                double marks2 = Double.parseDouble(strout[2]);
                for (Student data : bst.keys()) {
                    if (data.getTotal() >= marks1 && data.getTotal() <= marks2) {
                        System.out.println(data.getName());
                    }
                }
                break;
                case "LE" :
                double regNum = Double.parseDouble(strout[1]);
                for (Student data : bst.keys()) {
                    if (data.getTotal() <= regNum) {
                        System.out.println(data.getName());
                    }
                }
                break;
                case "GE":
                double number = Double.parseDouble(strout[1]);
                for (Student data : bst.keys()) {
                    if (data.getTotal() >= number) {
                        System.out.println(data.getName());
                    }
                }
                break;
                default :
                break;
            }
    }
}
}
