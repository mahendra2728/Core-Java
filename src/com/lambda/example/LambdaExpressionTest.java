package com.lambda.example;

interface Demo
{
	public String operate(String val1,String val2);
}

public class LambdaExpressionTest {

	public static void main(String[] args) {

		Demo add=(a,b)->(a+b);
		System.out.println("Addition : "+add.operate("Mahendra","Mahi"));

	}

}
