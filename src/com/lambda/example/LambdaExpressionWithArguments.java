package com.lambda.example;

@FunctionalInterface
interface Sum
{
	public int addition(int a,int b);
	public default void display()
	{
		System.out.println("This is default method...");
	}
}

public class LambdaExpressionWithArguments {

	public static void main(String[] args) {
		
		Sum addtion=(m,n)->(m+n);
		System.out.println("Addition : "+addtion.addition(10,10));
		
		Sum multiply=(a,b)->(a*b);
		System.out.println("Multiply : "+multiply.addition(10,2));
		
		Sum division=(a,b)->(a/b);
		System.out.println("Division : "+division.addition(10,2));
		
		Sum module=(a,b)->(a%b);
		System.out.println("Module : "+module.addition(10,2));
		
		Sum replace=(a,b)->{
			return b;
		};
		System.out.println("Replace : "+replace.addition(10,2));
		
		Sum add=(m,n)->{
			return m*n;
		};
		System.out.println("Replace333 : "+add.addition(10,2));

	}

}
