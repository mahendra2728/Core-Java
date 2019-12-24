import java.util.Arrays;

public class Example2 {
	 public static void main(String []args){
         int number=5;
         String result="";
         for(int i=1;i<=number;i++)
         {
            // System.out.println(i);
             int  m=i;
             while(m!=0)
             {
                 for(int j=1;j<=m;j++) {
                 result=result+String.valueOf(j)+",";
                 --m;
                 }
             }
         }
         /*String strArray[] = result.split(",");
         int size = strArray.length;
         int [] arr = new int [size];
         for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
         }*/
       //  Arrays.sort(arr);
         System.out.println(result);
     }

}
