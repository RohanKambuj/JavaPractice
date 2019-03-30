package jan28Assignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n,number,reversenumber=0,originalnumber;    
		  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		sc.close();
		
		originalnumber=number;    
		  
		while(number>0){    
		   n=number%10;    
		   reversenumber=(reversenumber*10)+n;    
		   number=number/10;    
		  }
		  
		  if(originalnumber==reversenumber)    
		   System.out.println(originalnumber+" is palindrome number ");    
		  else    
		   System.out.println(originalnumber+" is not palindrome number");

	}

}
