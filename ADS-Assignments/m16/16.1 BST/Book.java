/**
 * Class for book.
 */
class Book {
    /**
     * { var_description.
     */
    private String name;
    /**
     * { var_description.
     */
    private String author;
    /**
     * var_description.
     */
    private Float price;
    /**
     * Constructs the object.
     */
    private Book() { }
    /**
     * Constructs the object.
     *
     * @param      bookname    The bookname
     * @param      bookauthor  The bookauthor
     * @param      bookprice   The bookprice
     */
    Book(final String bookname, final String bookauthor,
        final Float bookprice) {
        this.name = bookname;
        this.author = bookauthor;
        this.price = bookprice;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
     public String getname() {
        return this.name;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
    public String getauthor() {
        return this.author;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
    public Float getprice() {
        return this.price;
    }
    /**
     * function_description.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Book that) {
        if (this.getname().compareTo(that.getname()) > 0) {
            return 1;
        } else if (this.getname().compareTo(that.getname()) < 0) {
            return -1;
        } else if (this.getauthor().compareTo(that.getauthor()) < 0) {
            return -1;
        } else if (this.getauthor().compareTo(that.getauthor()) > 0) {
            return 1;
        } else if (this.getprice() > that.getprice()) {
            return 1;
        } else if (this.getprice() < that.getprice()) {
            return -1;
        } else {
            return 0;
        }
    }
}