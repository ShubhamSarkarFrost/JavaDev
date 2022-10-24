package LinkedList_Basic;

import java.io.IOException;

public class Main {

    public static void Main(String[]Args) throws IOException{
        Customer cust = new Customer("Tim",132.34);
        Customer anocust = cust;
        anocust.setBalance(12.18);
        System.out.println("Balance for Another Customer"+anocust.getbalance());
    }
}
