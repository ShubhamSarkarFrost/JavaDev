package Constructor_Progs.OverLoad;

import java.io.IOException;

public class OverLoadConstructor {

    public static void main(String[]Args)throws IOException {
        Book newbook = new Book();
        newbook.printBookValue();
        Book newbookHarry = new Book("Harry Potter", "JK ROWLING");
        newbookHarry.printBookValue();
        Book newbookGrey = new Book("Fifty shades of Grey ", "E.L.JAMES", 80.99);
        newbookGrey.printBookValue();
    }
}
