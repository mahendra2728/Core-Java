package com.lambda.example;

public class LambdaDemo {
	
	interface MyFunctional1
	{
		int operation(int a,int b);
	}
	interface MyFunctional2
	{
		void showMessage(String message);
	}
	private int  result(int a,int b,MyFunctional1 myfun1)
	{
		return myfun1.operation(a, b);
	}
	
	static public void main(String args[])
	{
		LambdaDemo lm=new LambdaDemo();
		
		
		MyFunctional1 add=(int a,int b)->(a+b);
		MyFunctional1 mutiply=(int a,int b)->(a*b);
		
		System.out.println("Addition : "+lm.result(10,20, add));
		System.out.println("Mutiply : "+lm.result(10,20, mutiply));
		
		MyFunctional2 message=message2->System.out.println("Hey How are you "+message2);
		message.showMessage("Mahendra ");
		
	}

}
