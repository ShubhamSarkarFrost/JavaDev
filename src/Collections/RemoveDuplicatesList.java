package Collections;

import java.io.IOException;
import java.util.*;

public class RemoveDuplicatesList {

    public static void removeDuplicatesOne(List<String> list){

        HashSet<String> seen = new HashSet<>();
        List<String> uniqueList = new ArrayList<>();

        for(String item :list ){
            if(!seen.contains(item)){
                uniqueList.add(item);
                seen.add(item);
            }
        }

        list.clear();
        list.addAll(uniqueList);
    }

//    public static void removeDuplicatesTwo(List<String> list){
//        // Remove duplicates by converting to a LinkedHashSet
//        Set<String> set = new LinkedHashSet<>(list);
//
//        // Convert the set back to an ArrayList
//        List<String> listWithoutDuplicates = new ArrayList<>(set);
//    }

    public static void main(String[]Args) throws IOException {

        int i, noOfElements;
        List<String> l_list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in The List");
        noOfElements = sc.nextInt();
        System.out.println("Enter the Elements in the List");
        for (i = 0; i < noOfElements; i++) {
            l_list.add(sc.next());
        }
        System.out.println("Elements in the List are :" + l_list);
        removeDuplicatesOne(l_list);
        System.out.println("Elements after removal of duplicates are:"+l_list);
    }
}
