package LinkedList_Basic;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] Args) throws IOException{
        Customer cust = new Customer("Tim",132.34);
        Customer anocust = cust;
        anocust.setBalance(12.18);
        System.out.println("Balance for Another Customer"+anocust.getbalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i<intList.size(); i++){
            System.out.println(i + " :"+ intList.get(i));
        }
        System.out.println("<-----------------------------Entered 2 Data --------------------------------->");
        intList.add(1,2);
        for(int i = 0; i<intList.size(); i++){
            System.out.println(i + " :"+ intList.get(i));
        }

    }
}
