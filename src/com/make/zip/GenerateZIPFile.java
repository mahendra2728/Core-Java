package com.make.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GenerateZIPFile {
	
	 public static void main(String args[]) {

	        try {
	            // let's create a ZIP file to write data
	            FileOutputStream fos = new FileOutputStream("C:/test/uploaded/test.zip");
	            ZipOutputStream zipOS = new ZipOutputStream(fos);

	            File folder = new File("C://test");
	            File[] listOfFiles = folder.listFiles();

	            for (File file : listOfFiles) {
	                if (file.isFile()) {
	                	
	                    // System.out.println(file.getName().endsWith(".jpg"));
	                     
	                     // creating zip file only for perticular extension of file
	                     if(file.getName().endsWith(".jpg"))
	                        writeToZipFile(file.getName(), zipOS);
	                }
	            }

	           System.out.println(" File created successfully....");
	            
	            zipOS.close();
	            fos.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
	
	
	public static void writeToZipFile(String path, ZipOutputStream zipStream)
            throws FileNotFoundException, IOException {

       // System.out.println("Writing file : '" + path + "' to zip file");

        File aFile = new File("C://test/"+path);
        FileInputStream fis = new FileInputStream(aFile);
        ZipEntry zipEntry = new ZipEntry(path);
        zipStream.putNextEntry(zipEntry);

        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipStream.write(bytes, 0, length);
        }

        zipStream.closeEntry();
        fis.close();
    }

}
