import java.io.IOException;
import java.util.Scanner;

public class DataConversion {

    public static long printMegaBytesAndKiloBytes(double bitsPerKilobytes) {
        if (bitsPerKilobytes < 0) {
            return -1;
        }
        return Math.round(bitsPerKilobytes % 1024);
    }

    public static void printConversion(double bitsPerKilobytes) {
        if (bitsPerKilobytes < 0) {
            System.out.println("Invalid Va;ue");
        } else {
            long bitsPerBytes = printMegaBytesAndKiloBytes(bitsPerKilobytes);
            System.out.println(bitsPerKilobytes +
                    " KB = " + bitsPerBytes +
                    " KB");
        }
    }
    public static void main(String[] args) throws IOException {
        double bits;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Data Conversion Program , Please Enter the Data in bits");
        bits = sc.nextDouble();
        printConversion(bits);
    }
}
