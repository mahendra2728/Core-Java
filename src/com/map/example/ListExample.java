package com.map.example;

import java.util.ArrayList;

public class ListExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add("M");
		al.add("P");
		al.add("N");
		al.add("K");
		
		ArrayList al2=new ArrayList();
		al2.add("M");
		al2.add("A");
		al2.add("B");
		al2.add("P");
		
		System.out.println(al);
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		
		System.out.println("============= Retain ================");
		
		al.retainAll(al2);
		System.out.println(al);                                                                                                                                   
		
		al2.retainAll(al);
		System.out.println(al2);
		
		

	}

}
