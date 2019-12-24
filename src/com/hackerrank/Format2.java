package com.hackerrank;

import java.util.Scanner;

public class Format2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
	        System.out.println("Enter int : ");
	        int i = scan.nextInt();
	        
	        System.out.println("Enter Double : ");
	        Double double_string=scan.nextDouble();
	        
	        scan.nextLine();
	        
	        System.out.println("Enter String : ");
	        String s = scan.nextLine();
	      
	        

	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + double_string);
	        System.out.println("Int: " + i);
	}

}
