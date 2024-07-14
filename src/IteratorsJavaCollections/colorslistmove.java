package IteratorsJavaCollections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class colorslistmove {

    public static void main(String[]Args) throws IOException {

        // create a list of colors
        List<String> colors = new ArrayList<String>();

        //Create a Scanner Object for User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter colors (one per line, enter 'done' to finish):");

        while (true){
            String color = sc.nextLine().trim();
            if(color.equalsIgnoreCase("done")){
                break;
            }
            colors.add(color);
        }

        sc.close();

        Iterator<String> itr = colors.iterator();

        while(itr.hasNext()){
            System.out.println("All colors in the list entered are : - ");
            System.out.println(itr.next());
        }
    }
}
