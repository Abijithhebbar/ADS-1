class Check{
    public Check() {}
    public static void BE(StudentData[] a,Double m1, Double m2) {
        for (int i = 0; i < a.length ; i++) {
            if (a[i].getMarks() >= m1 && a[i].getMarks()<= m2) {
                System.out.println(a[i].getName());
            }
    }
}
public static void LE(StudentData[] a, Double m1) {
    for (int i = 0; i< a.length ; i++) {
        if (a[i].getMarks() <= m1) {
            System.out.println(a[i].getName());
        }
    }
}
public static void GE(StudentData[] a, Double m1) {
    for (int i =0; i< a.length;i++) {
        if(a[i].getMarks() >= m1) {
            System.out.println(a[i].getName());
        }
    }
    }
}