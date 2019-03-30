package jan28Assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
         int number,reverse=0;
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Input :");
         number = sc.nextInt();

         while(number!=0) {
        	 reverse = reverse * 10;
        	 reverse = reverse + number % 10;
        	 number = number / 10;
         }

         System.out.println("Output: "+reverse);
         sc.close();
	}

}
