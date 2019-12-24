package com.stream.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingFileWithStream {

	public static void main(String[] args) {
		
		String outputFile="C:\\test\\alphaFile2.txt";
		
		readFile("C:\\test\\alphaFile.txt" ,outputFile);
		readFilesPath("C:\\test");

	}
	
	public static void readFile(String filename,String file)
	{
		Path path=Paths.get(filename);
		try (Stream<String> lines=Files.lines(path)) 
		{
			lines.forEach(System.out::println);
			
			//write data into new file
			byte[] data=Files.readAllBytes(path);
			Files.write(Paths.get(file), data);
			System.out.println("File written successfully...");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("\n\n**************** END OF READING FILE ********************");
	}
	
	public static void readFilesPath(String directory)
	{
		Path dir = Paths.get(directory);
	  //  System.out.printf("%nThe file tree for %s%n", dir.toAbsolutePath());
	   
	    try (Stream<Path> fileTree = Files.walk(dir)) 
	    {
	      Set<Path> fileSet=fileTree.peek(e -> System.out.println("Taking integer: " + e)).collect(Collectors.toSet());
	      System.out.println("Total  Files : "+fileSet.size());
	    } 
	    catch (IOException e) {
	      e.printStackTrace();
	    }
	    
	    
	}

}
