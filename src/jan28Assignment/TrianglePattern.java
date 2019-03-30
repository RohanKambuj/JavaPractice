package jan28Assignment;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of triangle:");
		number = sc.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<number-i;j++) {
				System.out.print(" ");
			}
		for(int k=0;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println("");
	  }
		sc.close();
	}
}
