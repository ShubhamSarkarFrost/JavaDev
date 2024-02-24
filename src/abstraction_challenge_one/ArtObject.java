package abstraction_challenge_one;

public class ArtObject extends ProductForSale {
    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+ type + "is a beautifull reproduction");
        System.out.printf("The Price of this piece is $%6.2f %n", price);
        System.out.println(description);


    }
}
