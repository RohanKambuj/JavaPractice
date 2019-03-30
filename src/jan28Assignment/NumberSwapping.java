package jan28Assignment;

import java.util.Scanner;

public class NumberSwapping {

	public static void main(String[] args) {
		int number1,number2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		number1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		number2 = sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("First number is "+number1);
		System.out.println("Second number is "+number2);
		
		number1 = number1-number2;
		number2 = number1+number2;
		number1= number2-number1;
		
		System.out.println("After Swapping");
		System.out.println("First number is "+number1);
		System.out.println("Second number is "+number2);
		sc.close();
	}

}
