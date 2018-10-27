/**
 StudentData class
 */
class StudentData {
  /**
   String variable with the name name.
   **/
  private String name;
/**
 Double variable with the name marks
 */
  private double marks;
  /**
   Constructor.
   * @param name String type.
   * @param marks double type.
   */
  StudentData(String name, double marks) {
    this.name = name;
    this.marks = marks;
  }
  /**
   Complexity is 1.
   method is used to get the name.
   * @return name.
   */
  public String getName() {
    return this.name;
  }
  /**
   Complexity is 1.
   method is used to get the marks.
   * @return marks.
   */
  public double getMarks() {
    return this.marks;
  }
  /**
   method is used to print the data.
   * @return output.
   */
  public String toString() {
    String str = "";
    str = str + this.name + this.marks;
    return str;
  }
}