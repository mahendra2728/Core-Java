package com.map.example;

public class LargestNoInArray {

	public static void main(String[] args) {

		int[] inputArray=new int[] {19,34,24,65,100};
		int temp=0;
		for (int i = 0; i < inputArray.length-1; i++) {
			
			if(inputArray[i]>inputArray[i+1] && temp<inputArray[i])
			{
				temp=inputArray[i];
			}
			else if(inputArray[i+1]>temp && temp<inputArray[i+1])
			{
				temp=inputArray[i+1];
			}
				
			
		}
		System.out.println(temp);

	}

}
