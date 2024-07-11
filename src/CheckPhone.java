//import java.util.*;
//import java.io.*;
//
//
//public class CheckPhone {
//
//      public static void main(String[]) throws IOEXception {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine()
//
//        Map<String,Integer> phonebook = new HashMap<>();
//
//        for(int i = 0 ; i<n; i++){
//            String name = sc.nextLine();
//            int phone = sc.nextInt();
//            phonebook.put(name,phone);
//            sc.nextLine();
//         }
//         while(sc.hasNext()){
//            String search = sc.nextLine();
//            if(phonebook.containsKey(search)){
//                System.out.println(search+"="+phonebook.get(search));
//            }else{
//                System.out.println("Not found");
//            }
//         }
//
//
//      }
//}