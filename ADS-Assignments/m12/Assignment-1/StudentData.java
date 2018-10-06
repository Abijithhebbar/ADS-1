class StudentData implements Comparable<StudentData> {
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
    *COnstructor which loads the Students details.
    *@param name student name.
    *@param dob student date of birth.
    *@param sub1 student subject 1 marks.
    *@param sub2 student subject 2 marks.
    *@param sub3 students subject 3 marks.
    *@param total students total marks.
    *@param category students reservation category.
    */
    StudentData(final String name, final String dob, final int sub1,
        final int sub2, final int sub3, final int total,
        final String category) {
        this.studentName = name;
        this.dateOfBirth = dob;
        this.marks1 = sub1;
        this.marks2 = sub2;
        this.marks3 = sub3;
        this.totalMarks = total;
        this.cato = category;
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
    public int compareTo(final StudentData that) {
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