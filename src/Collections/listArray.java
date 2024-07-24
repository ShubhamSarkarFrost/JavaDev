package Collections;

import java.util.*;

public class listArray {

    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);

        //iterate through ArrayList
        Iterator<String> itr = list_Strings.iterator();

        System.out.println("Elements in the Iterator are:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Elements in the ForEach Loop are:");
        //iterate through forEach Loop
        for(String list : list_Strings){
            System.out.println(list);
        }

        // Now insert a color at the first and last position of the list
        list_Strings.add(0, "Pink");
        list_Strings.add(5, "Yellow");
        // Print the list
        System.out.println(list_Strings);

        System.out.println("Elements in the Iterator now are:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Update the third element with "Yellow"
        list_Strings.set(2, "Yellow");

        System.out.println("Elements in the List after update now are:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Remove the third element from the list.
        list_Strings.remove(2);
        // Print the list again
        System.out.println("After removing third element from the list:\n"+list_Strings);

        list_Strings.add("Black");
        // Search the value Red
        if (list_Strings.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

        System.out.println("Sorting Elements in Ascending Order");
        System.out.println("List before sort: "+list_Strings);
        Collections.sort(list_Strings);
        System.out.println("List after sort: "+list_Strings);

        System.out.println("Sorting Elements in Descending Order");
        System.out.println("List before sort: "+list_Strings);
        Collections.sort(list_Strings, Comparator.reverseOrder());
        System.out.println("List after sort: "+list_Strings);

        System.out.println("List before reversing :\n" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :\n" + list_Strings);

        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2: " + List2);

        Collections.copy(list_Strings, List2);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + list_Strings);
        System.out.println("List2: " + List2);

        List<String> sub_List = list_Strings.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("Array list before Swap:");
        for(String a: c1){
            System.out.println(a);
        }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");
        for(String b: c1) {
            System.out.println(b);
        }

        System.out.println("Original array list: " + c1);
        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: " + newc1);

        System.out.println("Original array list: " + c1);
        //Increase capacity to 6
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);

        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
    }

    }

