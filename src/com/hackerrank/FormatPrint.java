package com.hackerrank;

import java.util.Scanner;

public class FormatPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int length = String.valueOf(x).length();
            String x1 = null;
            if(length>=3)
              x=x;
              else{
                  x1="0"+String.valueOf(x);
              }
              if(length>=3)
            	  //System.out.println(s1+"               "+x);
                   System.out.format("%-10s  %10s\n",s1,x1);
              else
            	  System.out.format("%-10s  %10s\n",s1,x1);
        }
        System.out.println("================================");


	}

}
