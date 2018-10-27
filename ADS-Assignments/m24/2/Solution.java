import java.util.Scanner;
class Solution {
    private Solution() { }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        Sorting sort = new Sorting();
        Check check = new Check();
        int num = sc.nextInt();
        StudentData[] data = new StudentData[num];
        sc.nextLine();
        for(int i = 0; i < num; i++) {
            String[] strInp = sc.nextLine().split(",");
            data[size++] = new StudentData(strInp[0], strInp[1], Double.parseDouble(strInp[2]));
        }
        sort.Sort(data, size);
        int no = sc.nextInt();
        sc.nextLine();
            for(int j = 0; j< no ; j++) {
                String[] str = sc.nextLine().split(" ");
                switch (str[0]) {
                    case "BE":
                    check.BE(data, Double.parseDouble(str[1]), Double.parseDouble(str[2]));
                    break;
                    case "LE":
                    check.LE(data, Double.parseDouble(str[1]));
                    break;
                    case "GE":
                    check.GE(data, Double.parseDouble(str[1]));
                    break;

                }

            }
        }
}



