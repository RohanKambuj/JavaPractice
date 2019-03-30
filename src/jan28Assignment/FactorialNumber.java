package jan28Assignment;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int fact=1,number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+number+" is: "+fact);
		sc.close();
	}

}
