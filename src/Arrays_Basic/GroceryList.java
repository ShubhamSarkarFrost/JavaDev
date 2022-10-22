package Arrays_Basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  The Following Program shows the ArrayList<E> interface being used
 */
public class GroceryList {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        int choice;
        boolean quit = false;
        System.out.println("######### Welcome to Grocery List Program ###########");
        while(!quit){
            System.out.println("Enter 1- AddGrocery 2-removeGrocery 3-printGroceryList 4-modifyGroceryList 5-findItems");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addGrocery();
                    break;
                case 2:
                    removeGrocery();
                    break;
                case 3:
                    printGroceryList();
                    break;
                case 4:
                    modifyGroceryItem();
                    break;
                case 5:
                    findItems();
                    break;
                default:
                    System.out.println("Wrong Choice please enter an appropriate choice!!");
            }

        }

    }







    public static void addGrocery(){
        String item;
        System.out.println("Please Enter item in the grocery list");
        item = sc.next();
        groceryList.add(item);
    }

    public static void removeGrocery(){
        int index;
        System.out.println("Please Enter the item index of the elements you want to remove");
        index = sc.nextInt();
        groceryList.remove(index);
    }

    public static void printGroceryList(){
        System.out.println("You Have" + groceryList.size() + "items in your groceryList");
        for(int i = 0 ; i<groceryList.size(); i++){
            System.out.println(i+ "-" +groceryList.get(i));
        }
    }

    public static void modifyGroceryItem() {
        System.out.println("Enter the Position of the Data");
        int position = sc.nextInt();
        System.out.println("Enter the New Item");
        String newItem = sc.next();
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public static void findItems(){
        System.out.println("Enter an item to find \n");
        String SearchItem = sc.next();
        boolean exist = groceryList.contains(SearchItem);
        System.out.println(exist);
    }
}
