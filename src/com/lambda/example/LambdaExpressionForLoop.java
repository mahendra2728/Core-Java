package com.lambda.example;

import java.util.ArrayList;
import java.util.HashMap;

public class LambdaExpressionForLoop {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		list.add("Mahendra");
		list.add("Roman");
		list.add("Dean");
		list.add("Seth");
		list.add("Brock");
		list.add("Brawn");
		list.add("MS");
		list.add("MP");
		
		System.out.println("\n======================= forEach with ArrayList =================");
		list.forEach((value)->System.out.println(value+" "));
		
		System.out.println("\n======================= forEach with MAP =================");
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("A", "Apple");
		map.put("B", "Ball");
		map.put("C", "Cat");
		map.put("D", "Dog");
		map.forEach((k,v)->
		{
			System.out.println(k+" ---> "+v);
			if("D".equals(k))
			{
				System.out.println("In Condition : "+k+" ---> "+v);
			}
		});
		
		
		
		
	}

}
