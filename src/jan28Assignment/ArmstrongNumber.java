package jan28Assignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int c = 0, a, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();

		temp = number;

		while (number > 0) {
			a = number % 10;
			number = number / 10;
			c = c + (a * a * a);
		}

		if (temp == c) {
			System.out.println(c + " is Armstrong number");
		} else {
			System.out.println(c + " is not Armstrong number");
		}

		sc.close();
	}
}
