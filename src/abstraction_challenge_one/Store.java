package abstraction_challenge_one;

import java.io.IOException;
import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[]args) throws IOException {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionic Work by AFG Painting"));
        storeProducts.add(new ArtObject("Clay Work ", 1000, "Impressionic Work by clay works"));
    }

    public static void listProducts(){
        for( ProductForSale item : storeProducts){
            item.showDetails();

        }
    }
}
