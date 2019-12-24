
public class Palindrom {
	
	public static void main(String[] args)
	{
		if(checkPalindromOrNot("abba"))
		{
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
	}
	public static boolean checkPalindromOrNot(String input)
	{
		boolean flag=true;
		int i=0;
		int lenght=input.length()-1;
		
		while(i<lenght)
		{
			if(input.charAt(i)!=input.charAt(lenght))
				flag=false;
			
			i++;
			lenght--;
		}
		return flag;
	}

}
