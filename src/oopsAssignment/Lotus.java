package oopsAssignment;

import java.util.Scanner;

public class Lotus implements Flowers{

	int lotus=10, costOfLotus = 10, numberOfLotus, totalLotusCost;
	
	@Override
	public void showInventory() {
		
		System.out.println("Lotus available: "+lotus);
		
	}

	@Override
	public int placeOrder() {
		
		System.out.println("Enter no. of Lotus you want");
		Scanner scan = new Scanner(System.in);
		numberOfLotus=scan.nextInt();
		
		System.out.println("You ordered "+numberOfLotus+" lotus");
		
		lotus = lotus - numberOfLotus;
		return numberOfLotus;
	}
	
    public void totalLotusCost() {
		
    	totalLotusCost = numberOfLotus * costOfLotus;
		System.out.println("Total cost of lotus is: "+totalLotusCost);
	}
}
