package classCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EmpImpl {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "abc", 100);
		Emp e2 = new Emp(2, "def", 200);
		Emp e3 = new Emp(3, "ghi", 300);

		List<Emp> listOfEmpl = new LinkedList<Emp>();
		
		listOfEmpl.add(e1);
		listOfEmpl.add(e2);
		listOfEmpl.add(e3);
		
		System.out.println("List collection output");
		for(int i=0;i<listOfEmpl.size();i++) {
			System.out.println(listOfEmpl.get(i).ename);
			System.out.println(listOfEmpl.get(i).eno);
			System.out.println(listOfEmpl.get(i).salary);
		}
		
		Set<Emp> setOfEmp = new LinkedHashSet<Emp>();
		
		setOfEmp.add(e1);
		setOfEmp.add(e2);
		setOfEmp.add(e3);
		
		System.out.println("Set collection output");
		Iterator<Emp> itr = setOfEmp.iterator();
		
		while(itr.hasNext()) {
			Emp e = itr.next();
			System.out.println(e.ename);
			System.out.println(e.eno);
			System.out.println(e.salary);
		}
	}
}
