package com.lambda.example;

@FunctionalInterface
interface Vehicle
{
	public void doJourney();
}

public class SimpleLambdaExpression {

	public static void main(String[] args) {

		Vehicle v= new Vehicle() {
			
			@Override
			public void doJourney() {
				System.out.println("Hey Mahendra...");
				
			}
		};
		v.doJourney();
		
	}

}
