import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class addElementsCollection {

    public static void main(String[]Args) throws IOException {

        List<String> listcolors = new ArrayList<>();

        //create a scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter colors (one per line, enter 'done' to finish):");

        while (true){
            String color = sc.nextLine().trim();
            if(color.equalsIgnoreCase("done")){
                break;
            }
            listcolors.add(color);
        }



        //add an element to a destined position in the ArrayList
        System.out.println("Enter the color ");
        String newColor = sc.nextLine();
        System.out.println("Enter the position where you want to enter a new color ");
        int pos = sc.nextInt();
        listcolors.add(pos,newColor);
         sc.close();

        Iterator<String> itr = listcolors.iterator();
        while(itr.hasNext()){
            System.out.println("The Colors are: "+ itr.next());
        }
    }
}
