package com.stream.api;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamExample {

	public static void main(String args[])
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("m", 9);
		map.put("p", 8);
		map.put("h", 7);
		map.put("a", 6);
		map.put("m", 5);
		
		printStartLine("map with Stream Sorting");
		mapStreamExecution(map);
		printEndLine("map with Stream Sorting");
		
		
	}
	public static void mapStreamExecution(Map<String,Integer> map)
	{
		System.out.println("Original Map :"+map);
		
		Map<String,Integer> result=map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		
		System.out.println("Sorted Map :"+result);

		Map<String, Integer> result2 = new LinkedHashMap<>();
		
		map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
		System.out.println("result2 :"+result2);

		
		//Original Map :{p=8, a=6, h=7, m=5}
		//Sorted Map :{a=6, h=7, m=5, p=8}
	}
	
	public static void printStartLine(String message)
	{
		System.out.println("****************** START OF "+message.toUpperCase()+"********************");
	}
	public static void printEndLine(String message)
	{
		System.out.println("******************END OF "+message.toUpperCase()+"********************");
	}
}
