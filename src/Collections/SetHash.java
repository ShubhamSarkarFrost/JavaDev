package Collections;

import java.io.IOException;
import java.util.HashSet;

public class SetHash {

    public static void main(String[]Args) throws IOException {

        HashSet<String> h_set = new HashSet<String>();

        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        // print the hash set
        System.out.println("The Hash Set: " + h_set);


    }

}
