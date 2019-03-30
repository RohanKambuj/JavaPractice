package jan28Assignment;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number = 0;
        
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is even or odd");
       
        number = sc.nextInt();
        
        if(((number / 2)*2)== number)
        {
            System.out.println("The Given Number "+number+" is Even");
        }
        else
        {
            System.out.println("The Given Number "+number+" is Odd");
        }
        
        sc.close();
	}
}
