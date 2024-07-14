import java.io.IOException;
import java.util.*;

public class updateElementCollections {
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
        System.out.println("Enter the Element which you want to update:");
        String element = sc.next();

        try {
            System.out.println("Enter the position where you want to get the element from ");
            int pos = sc.nextInt();
            if(pos >=0 && pos<=colors.size()){
                System.out.println("Element updated at "+pos);
                colors.set(pos,element);
                for(String printcolor: colors ){
                    System.out.println("The Colors on list are "+ printcolor);
                }
            }else{
                System.out.println("No Element found");
            }
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException occurred.");
            System.out.println("Please enter a valid integer.");
            // Clearing the invalid input from the scanner
            sc.nextLine(); // Consume the invalid input
        }finally {
            sc.close();
        }





    }
}
