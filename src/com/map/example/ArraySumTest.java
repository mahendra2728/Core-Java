package com.map.example;

public class ArraySumTest {

	public static void main(String[] args) {

		int[] inputValues=new int[] {5,8,7,9,4};
		int compareValue=13;
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < inputValues.length; i++) {
			for (int j = i+1; j < inputValues.length; j++) {
				
				if(inputValues[i]+inputValues[j]==compareValue)
					sb.append("("+inputValues[i]+","+inputValues[j]+")");
			}
		}
		
		System.out.println(sb);
	}

}
