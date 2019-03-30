package jan28Assignment;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
         int count=0;
         String inputString;
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a String:");
         inputString = sc.next();
         
         for(int i=0; i<inputString.length(); i++) {
        	 if(inputString.charAt(i)=='E' || inputString.charAt(i)=='e') {
        		 count++;
        	 }
        }
         
         System.out.println("No. of Es in the string supplied are "+count);
         sc.close();
	}

}
