package SampleStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimplePrograms {

	public static void main(String[] args) {
		
		 findEvens(Arrays.asList(2,6,5,9,2,45,65,64,89,62));
		 startsWith(Arrays.asList(12,6,5,19,2,45,165,64,189,62,1));
		 findDuplicates(Arrays.asList(2,6,8,4,2,6,16,32,45,32,65,67,78,76,78,2));
		 groupByLength(Arrays.asList("cow","mat","dog","rider","fish","box","thumb","mickey","mouse"));
		 findFirstElement(Arrays.asList(2,6,8,4,2,6,98));

		 findNonRepeatedChar();
		 findFirstRepeatedChar();
		 sortList();
		 nonRepeatedSort();
	}
	
	public static void findEvens(List<Integer> list) {
		List<Integer> evens= list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evens);
		list.stream().filter(i->i%2==0).forEach(System.out::println);
	}
	public static void startsWith(List<Integer> list) {
		List<Integer> startsWithOne = list.stream().map(s->s+"").filter(s->s.startsWith("1")).map(s->Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(startsWithOne);
	}
	
	public static void findDuplicates(List<Integer> list) {
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicates = list.stream().filter(i->!set.add(i)).collect(Collectors.toList());
		System.out.println(duplicates);
	}
	public static void groupByLength(List<String> list) {
		Map<Integer,List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}
	public static void findFirstElement(List<Integer> list) {
		list.stream().findFirst().ifPresent(System.out::println);
		long count = list.stream().count();
		int max =list.stream().max(Integer::compare).get();
		
		System.out.println("count="+count+" max="+max);
	}
	public static void findNonRepeatedChar() {
		 String input = "Java Hungry Blog Alive is Awesome";
		 Character result = input.chars()
				 .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
				 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				 .entrySet().stream()
				 .filter(entry->entry.getValue()==1L)
				 .map(entry->entry.getKey())
				 .findFirst().get();
         System.out.println("first non repetable char: "+result);
	}
	public static void findFirstRepeatedChar() {
		String input = "Java Hungry Blog Alive is Awesome";
		 Character result = input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
				 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
				 .entrySet().stream()
				 .filter(entry->entry.getValue()>1L)
				 .map(entry->entry.getKey()).findFirst().get();
		
		 System.out.println("First repetable char: "+result);
		 System.out.println(input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
				 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())));
	}
	public static void sortList() {
	
		List<Integer> list = Arrays.asList(2,6,8,4,2,6,16,32,45,32,65,67,78,76,78,2);
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List: "+sorted);
	}

	public static void nonRepeatedSort() {
		List<Integer> list = Arrays.asList(2,6,8,4,2,6,16,32,45,32,65,67,78,76,78,2);
		HashSet<Integer> set = new HashSet<>();
		list.stream().forEach(e->set.add(e));
		List<Integer> sorted = set.stream().sorted().collect(Collectors.toList());
		List<Integer> reverse = set.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Non repeated sorted list: "+sorted);
		System.out.println("Desc Order: "+reverse);
		
	}
}
