package classInheritance;

public class Manager extends Employee {

	boolean canGrantLeaves;
    int noOfReporties;
    
	public Manager(boolean canGrantLeaves, int noOfReporties) {
		
		this.canGrantLeaves = canGrantLeaves;
		this.noOfReporties = noOfReporties;
	}


	public void display() {
    	System.out.println("I am manager");
    }
}
