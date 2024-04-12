package jdbcTest.dto;


public class Book {
    private String isbn;
    private String btitle;
    private int bprice;
    private String bauthor;

    public Book() {
    }

    public Book(String isbn, String btitle, int bprice, String bauthor) {
        this.isbn = isbn;
        this.bprice = bprice;
        this.btitle = btitle;
        this.bauthor = bauthor;
    }

    @Override
    public String toString() {
        return  isbn + "  " + btitle + "  " +
                "  " + bprice + "  " + bauthor;
    }
}
