package com.map.example;

import java.io.IOException;

public class ExecuteAnotherApplication {

	public static void main(String[] args) throws IOException {

		String[] input=new String[] {"Command Prompt","https://www.nextenture.com"};
		Runtime run=Runtime.getRuntime();
		run.exec(input);

	}

}
