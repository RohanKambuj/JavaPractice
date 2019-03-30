package classInheritance;

public class EmployeeImpl {

	public static void main(String[] args) {
		
		Manager m = new Manager(true,10);
		
		m.name = "Rohan";
		m.contact = 5151155;
		m.eno = 1;
		m.designation ="Manager";
		m.noOfReporties=10;
		m.canGrantLeaves=true;
		m.salary=555885;
		
		m.display();

	}

}
