
public class TiktactocGame {

	public static void main(String[] args) {

		String[] array1= {"*","@","-"};
		String[] array2= {"*","@","-"};
		String[] array3= {"*","@","-"};
		
		  for (int i = 0; i < array1.length; i++) 
		  {
			
			if(array1[i]==array2[i+1]==array3[array3.length-1].equals(array1[i]))
			{
				System.out.println("Player "+array1[i]+" won");
			}
			else if(array1[i]==array2[i]==array3[i].equals(array1[i]))
			{
				System.out.println("Player "+array1[i]+" won");
			}
			else if (array1[i]==array2[i+1]==array3[array3.length-1].equals(array1[i]))
			{
				System.out.println("Player "+array1[i]+" won");
			}
		}

	}

}
