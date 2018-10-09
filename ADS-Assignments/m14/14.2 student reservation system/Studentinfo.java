/** class Studentinfo **/
class Studentinfo implements Comparable<Studentinfo> {
    /**
    * Student name.
    */
    public String studentName;
    /**
    *Student date of birth.
    */
    public String dateOfBirth;
    /**
    *Student subject 1 marks.
    */
    public int marks1;
    /**
    *Student subject 2 marks.
    */
    public int marks2;
    /**
    *Student subject 3 marks.
    */
    public int marks3;
    /**
    *Student's total marks.
    */
    public int totalMarks;
    /**
    *Student Reservation Cateogory.
    */
    public String cato;
    /**
     * integer with value 2.
     */
    final int two = 2;
    /**
     * integer with value 3.
     */
    final int three = 3;
    /**
     * integer with value 4.
     */
    final int four = 4;
    /**
     * integer with value 5.
     */
    final int five = 5;
    /**
     * integer with value 6.
     */
    final int six = 6;
    /**
    *COnstructor which loads the Students details.
    *@param name student name.
    *@param dob student date of birth.
    *@param sub1 student subject 1 marks.
    *@param sub2 student subject 2 marks.
    *@param sub3 students subject 3 marks.
    *@param total students total marks.
    *@param category students reservation category.
    */
    Studentinfo(final String details) {
        String[] data = details.split(",");
        this.studentName = data[0];
        this.dateOfBirth = data[1];
        this.marks1 = Integer.parseInt(data[two]);
        this.marks2 = Integer.parseInt(data[three]);
        this.marks3 = Integer.parseInt(data[four]);
        this.totalMarks = Integer.parseInt(data[five]);
        this.cato = data[six];
    }
    /**
    *this method is used to divide and check the date.
    *@return divided date format.
    */
    public String[] dateCheck() {
        String[] check = dateOfBirth.split("-");
        return check;
    }
    /**
    *this method is used to compare the information of the student.
    *@param that second student to which comparison has to take place.
    *@return integer value.
    */
    public int compareTo(final Studentinfo that) {
        if (this.totalMarks > that.totalMarks) {
            return 1;
        } else if (this.totalMarks < that.totalMarks) {
            return -1;
        }
        if (this.marks3 > that.marks3) {
            return 1;
        } else if (this.marks3 < that.marks3) {
            return -1;
        }
        if (this.marks2 > that.marks2) {
            return 1;
        } else if (this.marks2 < that.marks2) {
            return -1;
        }
        if (Integer.parseInt(this.dateCheck()[2])
            > Integer.parseInt(that.dateCheck()[2])) {
            return 1;
        } else if (Integer.parseInt(this.dateCheck()[2])
            < Integer.parseInt(that.dateCheck()[2])) {
            return -1;
        }
        if (Integer.parseInt(this.dateCheck()[1])
            > Integer.parseInt(that.dateCheck()[1])) {
            return 1;
        } else if (Integer.parseInt(this.dateCheck()[1])
            < Integer.parseInt(that.dateCheck()[1])) {
            return -1;
        }
        if (Integer.parseInt(this.dateCheck()[0])
            > Integer.parseInt(that.dateCheck()[0])) {
            return 1;
        } else if (Integer.parseInt(this.dateCheck()[0])
            < Integer.parseInt(that.dateCheck()[0])) {
            return -1;
        }
        return 0;
    }
}