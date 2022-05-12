import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrime {

    public static boolean isPrime(int number) {

        int i;
        if (number == 1) {
            return false;
        }

        for (i = 2; i < number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[]args) throws IOException{

//        int number ;
        int i;
        int startrange;
        int endrange;
        int flag = 0;
//        boolean result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the Number you want to check as Prime");
//        number = Integer.parseInt(br.readLine());
//        result = isPrime(number);
//        System.out.println(result);
        System.out.println("Enter the staring range of the number you want to check as Prime !");
        startrange = Integer.parseInt(br.readLine());
        System.out.println("Enter the ending range of the number you want to check as Prime !");
        endrange = Integer.parseInt(br.readLine());
        for(i = startrange ; i <= endrange ; i++){
            if (isPrime(i) == true){
                flag ++;
                System.out.println("Prime Number got is "+ i);
                if(flag == 3)
                    System.out.println("Three Prime Numbers are got");
                    break;
            }
            else{
                continue;
            }
        }


    }
}
