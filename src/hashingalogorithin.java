import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hashingalgorithim {

       public static void main(String[] Args) throws NoSuchAlgorithmException {
         
           Scanner sc = new Scanner(System.in);
           String sen = sc.next();
           sc.close();

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sen.getBytes());
            
            byte[] bytes = md.digest();

            for(byte b : bytes){
             System.out.print("%02x", b); 
            }
       }
}
