import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class retrieveElementCollection {

    public static void main(String[] Args) throws IOException {

        // create a list of colors
        List<String> colors = new ArrayList<String>();

        //Create a Scanner Object for User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter colors (one per line, enter 'done' to finish):");

        while (true) {
            String color = sc.nextLine().trim();
            if (color.equalsIgnoreCase("done")) {
                break;
            }
            colors.add(color);
        }



        Iterator<String> itr = colors.iterator();
        System.out.println("All colors in the list entered are : - ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Enter the position where you want to get the element from ");
        int pos = sc.nextInt();

        sc.close();

        if(pos >=0 && pos <colors.size()){
            System.out.println("The Element retrived is :"+ colors.get(pos));
        }else{
            System.out.println("No Element matching found");
        }
    }
}