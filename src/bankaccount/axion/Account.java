package bankaccount.axion;

public class Account {

    private long account_number;
    private int balance;
    private String customer_name;
    private String email;
    private long phonenumber;


    // getters //
    // get Account Number //
    public void getAccontnumber(long account_number){
        this.account_number = account_number;
    }
    // get Balance //
    public void getbalance(int balance){
        this.balance = balance + 100000;

    }
    // get Customer Name
    public void getCustomerName(String customer_name){
        this.customer_name = customer_name;
    }
    // get Email
    public  void getEmail(String email){
        this.email = email;
    }

    public void getPhoneno(long phonenumber){
        this.phonenumber = phonenumber;
    }

    // setters //
    public long setAccountNumber(){
        return this.account_number;
    }
    public int setBalance(){
        return this.balance;
    }
    public String setCustomerName(){
        return this.customer_name;
    }
    public String setEmail(){
        return this.email;
    }
    public  long setPhoneNo(){
        return this.phonenumber;
    }

    // deposit funds //
    public int depositFunds(int deposit_funds){
        return this.balance + deposit_funds;
    }
    // withdraw funds //
    public int withdrawFunds(int withdraw_funds){
        if(this.balance > withdraw_funds){
            return this.balance - withdraw_funds;
        }
        else{
            return 0;
        }

    }



}
