import java.io.IOException;
import java.util.*;

public class copyCollections {
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

        // create another list of colors
        List<String> colorsnew = new ArrayList<String>();
        System.out.println("Enter colors (one per line, enter 'done' to finish):");

        while (true) {
            String color = sc.nextLine().trim();
            if (color.equalsIgnoreCase("done")) {
                break;
            }
            colorsnew.add(color);
        }


        Iterator<String> itrnew = colorsnew.iterator();
        System.out.println("All colors in the list entered are : - ");
        while (itrnew.hasNext()) {
            System.out.println(itrnew.next());
        }
        sc.close();

        System.out.println("Add Elements in the Lists:");
        Collections.copy(colors,colorsnew);

        for(String colorslist: colors){
            System.out.println(colorslist);
        }
    }
}
