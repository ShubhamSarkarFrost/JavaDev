import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class colorsCollections {

    public static void main(String[]Args)  throws IOException {

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

        //close the scanner
        sc.close();

        //print out the values using for each loop
        for(String printcolor: colors ){
            System.out.println("The Colors on list are "+ printcolor);
        }
    }
}
