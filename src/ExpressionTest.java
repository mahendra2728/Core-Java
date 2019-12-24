
public class ExpressionTest {
	
 public static void main(String []args){
         
         String input="{{([])}}";
         int len=input.length()/2;
        
         String first=input.substring(0,len);
         String second=input.substring(4);
         
         String[] firstA = first.split("");
         String[] secondB = second.split("");
         
       //  System.out.println(" first : "+first.length());
        // System.out.println(" second : "+second.length());
         System.out.println(" first : "+first);
         System.out.println(" second : "+second);
         
         boolean flag=false;
         char c;
         char current;
         for(int i=0;i<first.length()-1;i++)
         {
            
          //  System.out.println(" current : "+current);
          for(int j=i;j<=i;j++)
           {
        	   current = first.charAt(i);
               c = second.charAt(j);  
               String com1=String.valueOf(current);
               String com2=String.valueOf(c);
               String com=com1+com2;
              // System.out.println(current+" <> "+current+c);
               if(com.equals("{}"))
               {
                   flag=true;
                 
               }else if(com.equals("[]")) 
               {
            	   flag=true;
               }else 
               {
            	   flag=false;
                }
                  
               if(flag)
                   break;
               
           }
           
                
         }
         if(flag)
           System.out.println("match");
         else
           System.out.println(" Not Match");
           
           
    
     }

}
