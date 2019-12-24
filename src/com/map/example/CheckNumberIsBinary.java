package com.map.example;

public class CheckNumberIsBinary {

	public static void main(String[] args) {
		
		int input=1017101;
		boolean flag=true;
		int copynumber=input;
		while(copynumber!=0)
		{
			int temp=copynumber%10;
			if(temp>1)
			{
				flag=false;
				break;
			}
			else {
				copynumber=copynumber/10;
			}
		}
		if(flag)
			System.out.println("Number "+input+ " Is Binary");
		else
			System.out.println("Number "+input+ " Is Not Binary");
	}

}
