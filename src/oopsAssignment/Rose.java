package oopsAssignment;

import java.util.Scanner;

public class Rose implements Flowers{

	int roses=10, costOfRose = 5, numberOfRose, totalRoseCost;

	@Override
	public void showInventory() {
		
		System.out.println("Roses available: "+roses);
		
	}

	@Override
	public int placeOrder() {
		
		System.out.println("Enter no. of Roses you want");
		Scanner scan = new Scanner(System.in);
		numberOfRose=scan.nextInt();
		
		System.out.println("You ordered "+numberOfRose+" roses");
		
		roses = roses - numberOfRose;
		return numberOfRose;
	    
	}
	
	public void totalRoseCost() {
		
		totalRoseCost = numberOfRose * costOfRose;
		System.out.println("Total cost of roses is: "+totalRoseCost);
	}
}
