package com.map.example;

import java.util.ArrayList;
import java.util.HashMap;

public class NextGen29 {

	public static void main(String[] args) {
		
		String input="AAABBCD";  //ERROR 
		ArrayList<Integer> finalCount=new ArrayList<Integer>();
		HashMap<Character,Integer> alpha=new HashMap<Character,Integer>();
		char [] ch=input.toCharArray();
		int count=1;
		for (int i = 0; i < ch.length; i++)
		{
			if(!Character.isDigit(ch[i]))
			{
				if(alpha.containsKey(ch[i]))
				{   alpha.put(ch[i],alpha.get(ch[i]));
				    finalCount.add(alpha.get(ch[i]));
				}
				else
				{
					alpha.put(ch[i], count);
					finalCount.add(count++);
				}
			}
			else 
			{
				finalCount.clear();
				finalCount.add(0);
			}	
		}
		for(Integer val:finalCount)
		{
			if(val==0)System.out.print("ERROR");
			else System.out.print(val);
		}
			

	}

}
