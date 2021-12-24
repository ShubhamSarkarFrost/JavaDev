package academy.axion;

import java.io.IOException;

public class PrimitiveData {

    public static void main(String[] args) throws IOException {
        byte bytevalue = 10;
        short shortvalue = 20;
        int intvalue = 50;

        long Total = 50000L+ 10L *(bytevalue +shortvalue+ intvalue);

        System.out.println(Total);
    }


}
