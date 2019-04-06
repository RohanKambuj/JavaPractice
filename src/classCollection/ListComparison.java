package classCollection;

import java.util.ArrayList;
import java.util.List;

public class ListComparison {

	public static void main(String[] args) {

		// String lists comparison
		List<String> list1 = new ArrayList<String>();

		list1.add("Rohan");

		List<String> list2 = new ArrayList<String>();

		list2.add("Vivan");

		if (list1.equals(list2)) {

			System.out.println("Lists are equal");
		} else {
			System.out.println("Lists are not equal");
		}

		// Integer list comparison
		List<Integer> intList1 = new ArrayList<Integer>();

		intList1.add(1);
		intList1.add(2);

		List<Integer> intList2 = new ArrayList<Integer>();

		intList2.add(1);
		intList2.add(3);

		if (intList1.equals(intList2)) {
			System.out.println("Lists are equal");
		} else {
			System.out.println("Lists are not equal");
		}
	}
}
