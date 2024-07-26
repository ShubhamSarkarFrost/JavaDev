package Collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeElementsConditionally {

    public static void main(String[]Args) throws IOException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.removeIf(n -> (n % 2 == 0)); // Remove even numbers

        System.out.println("List after removing even numbers: " + list);
    }
}
