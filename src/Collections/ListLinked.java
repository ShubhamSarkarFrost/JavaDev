package Collections;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListLinked {

    public static void main(String[]Args) throws IOException {
        // Create a LinkedList
        LinkedList<String> l_list = new LinkedList<>();

        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        // print the list
        System.out.println("The linked list: " + l_list);

        //Iterate through the elements through iterator
        System.out.println("Iterate through the elements through iterator");
        Iterator<String> itr = l_list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //Iterate through enhancedFor Loop
        System.out.println("Iterate through enhancedFor Loop");
        for(String list : l_list){
            System.out.println(list);
        }

        //Iterate through the Elements through descending Order
        Iterator<String> desitr = l_list.descendingIterator();
        System.out.println("Iterate through the Elements through descending Order");
        while(desitr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Original linked list:" + l_list);
        // Add an element at the beginning
        l_list.addFirst("White");

        // Add an element at the end of list
        l_list.addLast("Pink");
        System.out.println("Final linked list:" + l_list);

        // Add an element to front of LinkedList
        l_list.offerFirst("Pink");
        System.out.println("Final linked list:" + l_list);

        // Add an element at the end of a linked list
        l_list.offerLast("Pink");
        System.out.println("Final linked list:" + l_list);

        LinkedList <String> new_l_list = new LinkedList <String> ();
        new_l_list.add("White");
        new_l_list.add("Pink");

        // Add the collection in the second position of the existing linked list
        l_list.addAll(1, new_l_list);

        // print the new list
        System.out.println("LinkedList:" + l_list);
//
//        // Removing all the elements from the linked list
        l_list.clear();

        System.out.println("The New linked list: " + l_list);

        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        //Swap all the elements in a Collection
        int length = l_list.size();

        for (int i = 0; i < length - 1; i += 2) {
            Collections.swap(l_list, i, i + 1);
        }
        System.out.println("The New linked list: " + l_list);

        //Shuffle
        System.out.println("Linked list before shuffling:\n" + l_list);
        Collections.shuffle(l_list);
        System.out.println("Linked list after shuffling:\n" + l_list);

        // create an empty linked list
        LinkedList <String> c1 = new LinkedList <String> ();

        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first linked list: " + c1);
        LinkedList <String> c2 = new LinkedList <String> ();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second linked list: " + c2);

        // Let join above two list
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list: " + a);

        System.out.println("Original linked  list: " + c1);
        LinkedList newc1 = new LinkedList <String> ();
        newc1 = (LinkedList)c1.clone();
        System.out.println("Cloned linked list: " + newc1);

        // Retrieve but does not remove, the first element of a linked list
        String x = c1.peekFirst();
        System.out.println("First element in the list: " + x);
        System.out.println("Original linked list: " + c1);

        // Remove and Return, the first element of a linked list
        System.out.println("Original linked  list: " + c1);

        System.out.println("Removed element: "+c1.pop());

        System.out.println("Linked list after pop operation: "+c1);
    }
}
