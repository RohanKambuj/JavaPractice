package InheritanceAssignment;

import java.util.Scanner;

public class EmployeeImpl{
	
	public static void main(String[] args) {
		
    int i,size,searchKey;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter no. of records to add:");
    size=scan.nextInt();
    
    Employee emp[] = new Employee[size];
    for(i=0;i<size;i++)
    emp[i]= new Employee();
    
    for(i=0;i<size;i++) {
    emp[i].addRecord();
    }
    
    for(i=0;i<size;i++) {
    emp[i].displayRecord();
	}
    
    System.out.println("Enter the record you want to search");
    searchKey=scan.nextInt();
    
    for(i=0;i<size;i++) {
    	if(searchKey==emp[i].empnum) {
    		emp[i].displayRecord();
    	}
    }
	}
}
