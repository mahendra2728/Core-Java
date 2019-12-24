import java.util.ArrayList;

public class LoyLogicArray {

	public static void main(String[] args) {
	
		int[] array={1,-1,2,4,0,0};
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length-1; j++) {
				
				if(array[i]+array[j]==0)
				{
					list.add(array[i]+","+array[j]);
				}
			}
		}
		System.out.println(list);

	}

}
