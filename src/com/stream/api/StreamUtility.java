 package com.stream.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtility {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("A","N","C","D","E","F","M","P","M","A");
		
		List<String> names=list.stream().filter(p->(p.equals("M") || p.equals("P"))).collect(Collectors.toList());
		names.forEach(s->System.out.print(" "+s));
		
		System.out.print("\n=== #### Using parallelStream #### ======");
		Stream<String> unique=list.parallelStream();
		unique.forEachOrdered(o->System.out.print(" "+o));
		
		System.out.print("\n=== #### Using Stream #### ======");
		Stream<String> unique2=list.stream();
		unique2.forEachOrdered(o->System.out.print(" "+o));
		
		System.out.print("\n=== #### Using count() #### ======");
		long count=list.stream().count();
		System.out.println("Size of list is : "+count);
		
		System.out.print("\n=== #### Using limit() #### ======");
		Stream<String> limit=list.stream().limit(5);
		limit.forEach(p->System.out.print(" "+p));
		
		
		System.out.print("\n=== #### Using skip() #### ======");
		Stream<String> limit2=list.stream().skip(2);
		limit2.forEach(p->System.out.print(" "+p));
		
		
		System.out.print("\n=== #### Using Reduce() #### ======");
		Optional<String> limit3=list.stream().reduce((first, second)-> first + "-" + second);
		
		limit3.ifPresent(System.out::println);
		
		System.out.print("\n=== #### Using Map() #### ======");
		List<String> limit4=list.stream().map(p->p.toUpperCase())
									.collect(Collectors.toList());
		
		limit4.forEach(System.out::print);
		
		
		System.out.println("\n========================= MAP EXAMPLE ============================");
		
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Roman");
	    map.put(2, "Seth");
	    map.put(3, "Dean");
	    map.put(4, "Roman");
	    map.put(5, "Brock");
	    map.put(6, "Dean");
	    
	    Map<Integer, String> result=map.entrySet()
	    		                    .stream().filter(p->p.getValue()=="Roman")
	    		                    .collect(Collectors.toMap(p-> p.getKey(),p -> p.getValue()));
	    		                    
	    System.out.println(result);	  
	    
	    
	    Map<Integer, String> result2=map.entrySet().stream()
	    								.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
	    
	    System.out.println(result2);	
	   
	    System.out.println("\n========================= SET EXAMPLE ============================");			
		
		Set<String> set=new HashSet<String>();
		set.add("Mahendra");
		set.add("Ajit");
		set.add("Harshal");
		set.add("Nilesh");
		set.add("Aniket");
		
		
		Set<String> result1=set.stream().collect(Collectors.toSet());
		result1.forEach(p->System.out.print(p+" "));
	}

	
	
	
	
	
	
	
	
}
