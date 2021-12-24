import java.util.Scanner;

public class TernaryVote {

    public static void main(String[] args){
      int age;
      boolean allowed;
        System.out.println("Enter Your Age !!");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
//        if(age == 0){
//            System.out.println("Please Enter a Proper Age");
//            System.exit(0);
//        }
//        else if(age >=18){
////            age > 18 ? true:false ;
//            System.out.println("He is allowed to Vote");
//        }
//        else {
//            System.out.print("Please Insert a Proper Age");
//        }
        allowed = age >= 18 ? true:false;
        if(allowed == true){
            System.out.println("Person is allowed to Vote\n");
        }else{
            System.out.println("Person is not allowed to Vote\n");
        }
    }
}
