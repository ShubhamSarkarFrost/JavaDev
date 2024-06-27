import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
         String pattern= "(<)(.+)(>)([-\\w!@\\$%^&#\\*()_+|~=`\"\\{\\}\\[\\]:'\\, ]+)(</)(\\2)(>)";
         Pattern r = Pattern.compile(pattern, Pattern.MULTILINE);
         Matcher m = r.matcher(line);
         if (m.find()) {
             do {
             System.out.println(m.group(4));
             }
             while (m.find());
         }
         else {
             System.out.println("None");
         }
			
			testCases--;
		}
	}
}