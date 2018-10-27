class StudentData {
  private String studentName;
  private double totalMarks;
  StudentData(String name, double marks) {
    this.studentName = name;
    this.totalMarks = marks;
  }
  public String getName() {
    return this.studentName;
  }
  public double getMarks() {
    return this.totalMarks;
  }
  public String toString() {
    String str = "";
    str = str + this.studentName + this.totalMarks;
    return str;
  }
}