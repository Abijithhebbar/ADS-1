class Student implements Comparable<Student> {
    private String name;
    private double total;
    private int regNumber;
    Student(final String name1, final String total1, final String regnumber1) {
        this.name  = name1;
        this.total = Double.parseDouble(total1);
        this.regNumber = Integer.parseInt(regnumber1);
    }
    public String getName() {
        return name;
    }
    public double getTotal() {
        return total;
    }
    public int getRollNo() {
        return regNumber;
    }
    public int compareTo(final Student that) {
        if (this.total > that.total) {
            return 1;
        }
        if (this.total < that.total) {
            return -1;
        }
        if (this.regNumber > that.regNumber) {
            return 1;
        }
        if (this.regNumber < that.regNumber) {
            return -1;
        }
        return 0;
    }
}