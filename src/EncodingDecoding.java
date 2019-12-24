import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class EncodingDecoding {

	private static String[][] UMLAUT_REPLACEMENTS = { { new String("Ä"), "Ae" }, { new String("Ü"), "Ue" }, { new String("Ö"), "Oe" }, { new String("ä"), "ae" }, { new String("ü"), "ue" }, { new String("ö"), "oe" }, { new String("ß"), "ss" } };

	public static void main(String[] args) throws UnsupportedEncodingException 
    { 
        // create a encoded URL to decode 
        String encoded = "20191015103443_Bestellen_Abholen_Präsenztrainings 2.xls"; 
  
        // print encoded URL 
       
        
        String encodedURL = java.util.Base64.getUrlEncoder() 
                .encodeToString(encoded.getBytes());
  
        // decode into String URL from encoded format 
        byte[] actualByte = java.util.Base64.getUrlDecoder() 
                                .decode(encodedURL); 
        
        System.out.println("encoded URL:\n"+ encodedURL); 
  
        String actualURLString = new String(actualByte); 
  
        // print actual String 
        System.out.println("actual String:\n"
                           + actualURLString); 
        
        
        String name = URLEncoder.encode(encoded, "UTF-8");
        
        System.out.println(name);
        
        String str=doUpperCase("20191015103443_Bestellen_Abholen_Präsenztrainings2.xls");
        System.out.println(str);
        
        System.out.println("ddd : "+replaceUmlaute("20191015103443_Bestellen_Abholen_Präsenztrainings2"));
    } 
	
	
	public static String doUpperCase(String str) {
		char[] strArr = str.toCharArray();
		String outStr = "";

		for (char c : strArr) {
			if (Character.isLetter(c) || Character.isDigit(c)) {
				
				if (c > 128) {
					int uniCode = (int) c;
					if (uniCode == 246 || uniCode == 252 || uniCode == 228)
						outStr += String.valueOf(c);
					else
						outStr += String.valueOf(c);

				} else {

					outStr += String.valueOf(c);
				}
			} else {
				outStr += String.valueOf(c);

			}

		}
		return outStr;
	}
	
	public static String replaceUmlaute(String orig) {
	    String result = orig;

	    for (int i = 0; i < UMLAUT_REPLACEMENTS.length; i++) {
	        result = result.replace(UMLAUT_REPLACEMENTS[i][0], UMLAUT_REPLACEMENTS[i][1]);
	    }

	    return result;
	}
}
