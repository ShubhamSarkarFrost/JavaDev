import java.io.IOException;
import java.util.*;

public class SortedList {
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
        System.out.println("Sorted Array in Ascending Order is :");
        Collections.sort(colors);
        Iterator<String> itrsort = colors.iterator();
        System.out.println("All colors in the list entered are : - ");
        while (itrsort.hasNext()) {
            System.out.println(itrsort.next());
        }
        System.out.println("Sorted Array in Descending Order is :");
        Collections.sort(colors,Collections.reverseOrder());
        for(String desc: colors){
            System.out.println(desc);
        }

    }
}
