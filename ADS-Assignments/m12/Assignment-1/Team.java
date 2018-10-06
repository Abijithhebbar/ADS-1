/**
 * Class for team.
 */
public class Team implements Comparable<Team> {
    private String[] input = new String[7];
    private String name;
    private String dateOfBirth;
    private Integer marks1;
    private Integer marks2;
    private Integer marks3;
    private Integer finalMarks;
    private String cato;
    private String[] dob = new String[3];
    private int day;
    private int month;
    private int year;


    /**
     * default constructor.
     */
    public Team() {

   }

    public Team(String inp) {
        this.input = inp.split(",");
        this.name = input[0];
        this.dateOfBirth = input[1];
        this.marks1 = Integer.parseInt(input[2]);
        this.marks2 = Integer.parseInt(input[3]);
        this.marks3 = Integer.parseInt(input[4]);
        this. finalMarks = Integer.parseInt(input[5]);
        this.cato = input[6];
        dob = dateOfBirth.split("-");
        this.day = Integer.parseInt(dob[0]);
        this.month = Integer.parseInt(dob[1]);
        this.year = Integer.parseInt(dob[2]);

    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.name;
    }
    public Integer year() {
        return this.year;
    }
    public Integer month() {
        return this.month;
    }
    public Integer day() {
        return this.day;
    }
    /**
     * Gets the wins.
     *
     * @return     The wins.
     */
    public Integer getHighesttotal() {
        return this.finalMarks;
    }

    public Integer highestmarks3() {
        return this.marks3;
    }

    public Integer highestmarks2() {
        return this.marks2;
    }
    /**
     * Checks the various attributes and returns -1 or 0 or 1 accordingly.
     *
     * @param      that  The that
     *
     * @return     -1 or 0 or 1
     */
    public int compareTo(Team that) {
        if (this.getHighesttotal() > that.getHighesttotal()) {
            return 1;
        } else if (this.getHighesttotal() < that.getHighesttotal()) {
            return -1;
        } else if (this.highestmarks3() < that.highestmarks3()) {
            return -1;
        } else if (this.highestmarks3() > that.highestmarks3()) {
            return 1;
        } else if (this.highestmarks2() > that.highestmarks2()) {
            return 1;
        } else if (this.highestmarks2() < that.highestmarks2()) {
            return -1;
        } else {
        if (this.year() < that.year()){
            return -1;
        } else if (this.year() > that.year()) {
            return +1;
        } else if (this.month() < that.month()) {
            return -1;
        } else if (this.month() > that.month()) {
            return +1;
        } else if (this.day() < that.day()) {
            return -1;
        } else if (this.day() > that.day()) {
            return +1;
        } else {
            return 0;
        }
        }
    }
}
