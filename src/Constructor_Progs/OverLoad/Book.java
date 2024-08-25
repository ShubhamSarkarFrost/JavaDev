package Constructor_Progs.OverLoad;

public class Book {
    String title, author;
    double price;

    public Book() {
        title = "Default Book";
        author = "Default Author";
        price = 0.00;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.00;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printBookValue() {
        System.out.println("The Title of the Book is :" + title + " Author is " + author + " and is priced at :" +
                price);
    }
}
