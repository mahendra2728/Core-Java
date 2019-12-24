package com.lambda.example;

interface StringOperation
{
	public String operation(String value1,String value2);
}

public class StringManipulationOperationLambdaExpression {

	public static void main(String[] args) {

		StringOperation concat=(firstValue,secondValue)->(firstValue+secondValue);
		System.out.println("Concatenation : "+concat.operation("Roman", "Seth"));
		
		StringOperation eeee=(t1,t2)->{return t1+t2+t2;};
		System.out.println("Concatenation 777777 : "+eeee.operation("Roman", "Seth"));
		
		
		StringOperation swapTwoString=(first,second)->(second+" "+first);
		System.out.println("Swap String : "+swapTwoString.operation("Mahendra", "Empire"));
		
		StringOperation toUpperCase=(first,second)->(first.toUpperCase()+" "+second.toUpperCase());
		System.out.println("UpperCase String : "+toUpperCase.operation("Mahendra", "Empire"));
		
		StringOperation countLength=(first,second)->
		{
			int size=(first+second).length();
			return "Size of First & Second String is :"+size;
		};
		
		System.out.println("Count Length of String : "+countLength.operation("Mahendra", "Maske"));
	}

}
