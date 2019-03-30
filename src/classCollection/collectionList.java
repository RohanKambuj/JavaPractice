package classCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collectionList {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.remove(2);
		
		System.out.println(al);
		
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		List<String> l = new LinkedList<String>();
		
		l.add("Rohan");
		l.add("Vivan");
		l.add("Sarang");
		
		l.remove(2);
		
		System.out.println(l);
		
		for(String s : l) {
			System.out.println(s);
		}
	}
}
