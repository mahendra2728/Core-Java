package com.map.example;

import java.io.DataInputStream;
import java.util.ArrayList;

public class NiceTestProgram {

	 public static void main(String []args)throws java.io.IOException {
         String line;
         String[] inputValues;
       //  System.out.println("============INPUT==============");
        // System.out.println(list.get(0)+" "+list.get(3)+" "+list.get(6));
         ArrayList list=new ArrayList();
         DataInputStream dis = new DataInputStream(System.in);
		 while((line = dis.readLine()) != null)
		 {
			 char[] ch=line.toCharArray();
			 for (int i = 0; i < ch.length; i++) {
				if(Character.isDigit(ch[i])) {
					list.add(ch[i]);
				}
			}
		 }
		  System.out.println("============OUTPUT==============");
		 System.out.println(list.get(0)+" "+list.get(3)+" "+list.get(6));
		 System.out.println(list.get(1)+" "+list.get(4)+" "+list.get(7));
		 System.out.println(list.get(2)+" "+list.get(5)+" "+list.get(8));
		                 
     }
}
