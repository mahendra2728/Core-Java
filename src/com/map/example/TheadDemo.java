package com.map.example;

public class TheadDemo extends Thread{

	public static void main(String[] args) {
       
		Thread t=new Thread();
		t.start();
		System.out.println("first start...");
		
		t.start();
		System.out.println("second start...");

	}

}
