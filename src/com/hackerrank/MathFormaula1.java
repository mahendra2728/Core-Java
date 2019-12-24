package com.hackerrank;

import java.util.Scanner;

public class MathFormaula1 {
	
	
	
	// (a+2^0 * b),(a+2^0.b+2^1.b),.....(a+2^0.b+2^n-1.b)

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
        while(true)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
           for(int j=0;j<n;j++)
           {
           		int x=a;
           		for(int k=0;k<=j;k++)
           		{
           			x=x+(int)Math.pow(2,k)*b;
           		}
           		System.out.print(x+" ");	
           }
           System.out.println(); 
        } 
		

	}

}
