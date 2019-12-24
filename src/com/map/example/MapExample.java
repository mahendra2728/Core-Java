package com.map.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String args[])
	{
		Map<Integer,String> mapList=new HashMap<Integer,String>();
		
		mapList.put(1, "Mahendra");
		mapList.put(4, "Nilesh");
		mapList.put(9, "Harshsal");
		mapList.put(10, "Amit");
		
      Map<Integer,String> mapList2=new HashMap<Integer,String>();
		
      mapList2.put(11, "Mahendra");
      mapList2.put(4, "Poo");
      mapList2.put(13, "Amit");
		
       mapList.putIfAbsent(9, "Po");
      
        mapList.putAll(mapList2);
		Set keySet=mapList.entrySet();
		Iterator it=keySet.iterator();
		System.out.println("==============Using Iterator==================");
		while(it.hasNext())
		{
			Map.Entry<Integer,String> map=(Map.Entry<Integer,String>)it.next();
			System.out.println(map.getKey()+" --->"+map.getValue());
			
		}
		System.out.println("==============Using Map.Entry==================");
		for(Map.Entry map:mapList.entrySet())
		{
			System.out.println(map.getKey()+" --->"+map.getValue());
		}
		
	}

}
