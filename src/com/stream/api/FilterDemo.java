package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {


		ArrayList<String> list=new ArrayList<String>();
		list.add("Mahendra");
		list.add("Pooja");
		list.add("Roman");
		list.add("Seth");
		list.add("Dean");
		list.add("Mahendra");
		
		System.out.println("Initial List : "+list);
		
		//We can generate stream  using two methods  1:stream() 2:parallelStream()
		List<String> usingStream=list.stream().collect(Collectors.toList());
		System.out.println("\nUsing stream() : "+usingStream);
		
		List<String> usingParalleStram=list.parallelStream().collect(Collectors.toList());
		System.out.println("\nUsing parallelStream() : "+usingParalleStram);
		
		//Distinct elements using Stram API
		System.out.println("\nGet Distinct Elements From List using distinct() of Stream : ");
		List<String> al=usingStream.stream().distinct().collect(Collectors.toList());
		al.forEach(p->System.out.print(" "+p));
		
		//Return size of List using stream method count()
		System.out.println("\nReturn size of List using count()  : ");
		int size=(int)usingParalleStram.stream().count();
		System.out.println("Size is : "+size);
		
		
		System.out.println("\nUsing Spliterator method ");
		Spliterator<String> s=list.spliterator();
		s.forEachRemaining(s1->System.out.print(" "+s1));
		
		
		//Using summeryStatistics
		System.out.println("\nUsing summeryStatistics method ");
		
		List<Integer> numbers=Arrays.asList(4,6,7,8,3,5,99,2);
		IntSummaryStatistics stats =numbers.stream().mapToInt(m->m).summaryStatistics();
		
		 System.out.println("Minimum Number : "+stats.getMin());
		 System.out.println("Max Number : "+stats.getMax());
		 System.out.println("Total Number : "+stats.getCount());
		 System.out.println("Sum of Number : "+stats.getSum());
		 System.out.println("Average of Number : "+stats.getAverage());
		
		
		
	}

}
