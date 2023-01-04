package OverLoading_Challenge_new_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[]Args) throws IOException {
        int heightinch , heightfeetinch;
        double outputinch , outputfeetinch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the height in Inches and feet to Convert it to Centimetres");
        heightinch = Integer.parseInt(br.readLine());
        heightfeetinch = Integer.parseInt(br.readLine());
        outputinch = convertInchestoCentimeters(heightinch);
        System.out.println("Height in Inches "+ outputinch);
        outputfeetinch = convertInchestoCentimeters(heightfeetinch, heightinch);
        System.out.println("Height in Feet and Inches is "+ outputfeetinch);



    }

    public static double convertInchestoCentimeters(int inchesHeight){
        System.out.println("***************Convert Inches to Centimeters******************");
        double height = inchesHeight * 2.54;
        return height;
    }
    public static double convertInchestoCentimeters(int feetheight , int inchesHeight){
        System.out.println("***************Convert Inches to Centimeters******************");
        double height = feetheight * 30.54 + inchesHeight * 2.54;
        return height;
    }


}
