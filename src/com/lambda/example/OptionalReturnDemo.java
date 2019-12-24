package com.lambda.example;

@FunctionalInterface
interface Test
{
	public String getMessage(String message);

}

public class OptionalReturnDemo {

	public static void main(String[] args) {

		Test t1=(m->m);
		System.out.println(t1.getMessage("Hello Mahendra"));
		
		Test t2=m->m.toUpperCase();
		System.out.println(t2.getMessage("Hello Mahendra"));
		
		Test t3=m->m.toLowerCase();
		System.out.println(t3.getMessage("Hello Mahendra"));

	}

}
