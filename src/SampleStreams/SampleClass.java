package SampleStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<String> customer = new ArrayList<>(); customer.add("Ramu");
		 * customer.add("Renu"); customer.add("Lath"); customer.add("Sandeep");
		 * customer.add("Hemanth"); Map<Integer,List<String>> map =
		 * customer.stream().collect(Collectors.groupingBy(String::length));
		 * customer.stream().map(cust->cust.toUpperCase()).forEach(System.out::println);
		 * //System.out.println(map);
		 */
		Check c1 = new Check(2);
		Check c2 = new Check(2);
		System.out.println("Double equals: "+(c1==c2) );
		System.out.println("equals: "+c1.equals(c1) );
	}

}
