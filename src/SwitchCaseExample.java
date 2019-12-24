import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SwitchCaseExample {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		long total=getTotalCountOfFiles("C://test//uploaded");
		int count=(int)total;
		while(count!=0)
		{
			List<String> files=getListOfFile("C://test//uploaded");
			System.out.println(files.get(count));
			TimeUnit.SECONDS.sleep(5);
			count--;
		}
		
	}
	
	
	
	
	public static List<String> getListOfFile(String filePath)
	{
		List<String> result = new LinkedList<String>();
		Path path=Paths.get(filePath);
		
		 try (Stream<Path> fileTree = Files.walk(path)) 
		    {
			 
			 result = fileTree.filter(Files::isRegularFile)
						.map(x -> x.toString()).collect(Collectors.toList());
		    } 
		    catch (IOException e) {
		      e.printStackTrace();
		    }
		return result;
		
		
	}
	
	public static long getTotalCountOfFiles(String filePath)
	{
		Path path=Paths.get(filePath);	
		long count=0L;
		 try (Stream<Path> fileTree = Files.walk(path)) 
		    {
			 
			 count = fileTree.count();
		    } 
		    catch (IOException e) {
		      e.printStackTrace();
		    }
		return count;
		
		
	}
	

}

