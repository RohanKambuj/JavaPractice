package InheritanceAssignment;

import java.util.Scanner;

public class Employee extends Person{
        int empnum;
        String designation;
        
        public void addRecord() {
        	
        	Scanner sc= new Scanner(System.in);
        	System.out.println("Name:");
        	name=sc.next();
        	System.out.println("Age:");
        	age=sc.nextInt();
        	System.out.println("Address:");
        	address=sc.next();
        	System.out.println("Contact:");
        	contact=sc.nextLong();
        	System.out.println("Gender:");
        	gender=sc.next();
        	System.out.println("Employee Id:");
        	empnum=sc.nextInt();
        	System.out.println("Designation:");
        	designation=sc.next();
        	
        }
        
        public void displayRecord() {
        	System.out.println("Details of Employee are:");
        	System.out.println("Name: "+name);
        	System.out.println("Age: "+age);
        	System.out.println("Address: "+address);
        	System.out.println("Contact: "+contact);
        	System.out.println("Gender: "+gender);
        	System.out.println("Id: "+empnum);
        	System.out.println("Designation: "+designation);
        }
}
