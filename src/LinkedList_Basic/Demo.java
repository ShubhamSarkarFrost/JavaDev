package LinkedList_Basic;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[]Args) throws IOException {
        LinkedList<String> placestoVisit = new LinkedList<String>();
        addInOrder(placestoVisit,"Sydney");
        addInOrder(placestoVisit,"Melborne");
        addInOrder(placestoVisit,"Brisbane");
        addInOrder(placestoVisit,"Perth");
        addInOrder(placestoVisit,"Canberra");
        addInOrder(placestoVisit,"Adelaide");
        addInOrder(placestoVisit,"Darwin");



//        placestoVisit.add("Sydney");
//        placestoVisit.add("Melborne");
//        placestoVisit.add("Brisbane");
//        placestoVisit.add("Perth");
//        placestoVisit.add("Canberra");
//        placestoVisit.add("Adelaide");
//        placestoVisit.add("Darwin");

        printList(placestoVisit);
        addInOrder(placestoVisit,"Alice Springs");
        addInOrder(placestoVisit,"Darwin");
        printList(placestoVisit);
//
//        placestoVisit.add(1,"Alice Springs");
//        printList(placestoVisit);
//
//        placestoVisit.remove(4);
//        printList(placestoVisit);
    }

    public static void printList(LinkedList<String> linklist) throws IOException{

        Iterator<String> itr = linklist.iterator();
        while (itr.hasNext()){
            System.out.println("Now Visiting ...."+itr.next());
        }
        System.out.println("======================================");

    }

    private static boolean addInOrder(LinkedList<String>ListCities, String newCity){
        ListIterator<String> itr = ListCities.listIterator();

        while(itr.hasNext()){
            int comparison = itr.next().compareTo(newCity);
            if(comparison == 0){
                //equal do not add
                System.out.println(newCity+" is already added!!");
                return false;
            }else if(comparison > 0){
                // new city should be added before this one
                itr.previous();
                itr.add(newCity);
                return true;
            }else if(comparison < 0){
                // move on next City
            }
        }
        itr.add(newCity);
        return true;
    }
}
