package oopsAssignment;

import java.util.Scanner;

public class FlowersImpl {

	public static void main(String[] args) {
		
		menu();
}

	public static void menu() {
		
		int choice=0,totalCost=0;
		String input;
		char selectFlower;
		
		Rose r = new Rose();
		Lotus l = new Lotus();
		
		
		while(choice!=3) {		
		
			System.out.println("Welcome to Fun and Petals");
			System.out.println("1. Show Inventory");
			System.out.println("2. Place Order");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1: if(r.roses!=0 || l.lotus!=0) {
				    r.showInventory();
				    l.showInventory();
			        }
			        else {
			        	System.out.println("Flowers are not available...SORRY!!!");
			        }
				    break;
				    
			case 2: if(r.roses!=0 || l.lotus!=0) {
				    System.out.println("Do you want Roses or Lotus or Both (R/L/B)");
				    
				    Scanner sc = new Scanner(System.in);
				    input = sc.nextLine();
				    selectFlower = input.charAt(0);
				    
				    if(selectFlower=='R') {
				    	if(r.roses!=0) {
				    		r.placeOrder();
				    		r.totalRoseCost();
				    		totalCost = r.totalRoseCost;
				    		System.out.println("Total cost of your order is: "+totalCost);
				    	}
				    	else {
				    		System.out.println("Roses are not available");
				    	}
				    }
				    else if(selectFlower=='L') {
				    	if(l.lotus!=0) {
				    		l.placeOrder();
				    		l.totalLotusCost();
				    		totalCost = l.totalLotusCost;
				    		System.out.println("Total cost of your order is: "+totalCost);
				    	}
				    	else {
				    		System.out.println("Lotus are not available");
				    	}
				    }
				    else if(selectFlower=='B') {
				    	if(r.roses!=0 || l.lotus!=0) {
				    		if(r.roses!=0) {
				    			r.placeOrder();
				    			r.totalRoseCost();
				    		}
				    		else {
				    			r.totalRoseCost=0;
				    		}
				    		if(l.lotus!=0) {
				    			l.placeOrder();
				    			l.totalLotusCost();
				    		}
				    		else {
				    			l.totalLotusCost=0;
				    		}
				    		
				    		totalCost=r.totalRoseCost+l.totalLotusCost;
				    		System.out.println("Total cost of your order is: "+totalCost);
				    	}
				    	else {
				    		System.out.println("Flowers are not available");
				    	}
				      }
			        }
			        else {
				        System.out.println("Flowers are not available");
			        }
				    break;
				    
			case 3: 
				    System.exit(0);
				    break;
				    
			default:
				    System.out.println("Wrong option selected...Please select correct option");
			}
		}	
	}
}
