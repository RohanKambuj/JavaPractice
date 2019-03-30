package jan28Assignment;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		
		int m,number,flag=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number= sc.nextInt();
		
		m=number/2;
		
		if(number ==0 || number == 1) {
			System.out.println("Nummber "+number+" is not a prime number");
		}
		else {
			for(int i=2;i<m;i++) {
				if(number%i==0) {
					System.out.println("Number "+number+" is not a prime number");
					flag=1;
				}
			}
			if(flag==0)
			System.out.println("Number "+number+" is a prime number");
		}
		sc.close();
	}

}
