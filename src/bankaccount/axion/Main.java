package bankaccount.axion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[]Args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi Customer , welcome to Axion Bank Please enter the details \n");
        System.out.println("Please Enter Customer Name \n");
        String customer_name = br.readLine();
        System.out.println("Please Enter Account Number \n");
        long acc_num = Long.parseLong(br.readLine());
        System.out.println("Please Enter Phone Number \n");
        long phone_num = Long.parseLong(br.readLine());
        System.out.println("Please Enter your Email \n");
        String email = br.readLine();

        System.out.println(" ######## Your Customer Details are as Follows : ##########");
        Account ob = new Account();
        ob.getCustomerName(customer_name);
        System.out.println("Customer Name : "+ob.setCustomerName());
        ob.getAccontnumber(acc_num);
        System.out.println("Account Number  : "+ob.setAccountNumber());
        ob.getPhoneno(phone_num);
        System.out.println("Phone Number : "+ob.setPhoneNo());
        ob.getEmail(email);
        System.out.println("Email : "+ob.setEmail());
        ob.getbalance(0);
        System.out.println("Balance : "+ob.setBalance());
        System.out.println("Please Enter a Choice 1 - Deposit  Any Key Else is Withdraw ?");
        int choice = Integer.parseInt(br.readLine());
        if(choice == 1){
            System.out.println("Please Enter the Deposit Amount ?");
            int dep_amt = Integer.parseInt(br.readLine());
            System.out.println("Your New Balance is :" + ob.depositFunds(dep_amt));
        }
        else{
            System.out.println("Please Enter the Withdraw Amount ?");
            int with_amt = Integer.parseInt(br.readLine());
             if(ob.setBalance() >= with_amt){
                 System.out.println("Your New Balance is  : "+ ob.withdrawFunds(with_amt));
             }
             else{
                 System.out.println("You DO NOT have sufficient balance to withdraw ");
             }
        }
    }
}
