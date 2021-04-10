//If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b
public class BeforeAndAfter {
	public static void main(String args[]) {
		String a = "abcXY123XYijk"; 
		String b = "XY"; 
		int index=-1; 
		int startIndex=0; 
		while((index=a.indexOf(b, startIndex))!=-1)
		{
			char before='\0';
		    char after='\0';
		    if(index!=0)
		    {
		    	before=a.charAt(index-1);
		        System.out.print(before);
		    }
		    if((index+b.length())!=a.length()) 
		    {
		    	after=a.charAt(index+b.length());
		        System.out.print(after);
		    }
		    startIndex=index+b.length(); 
		 }
		}
}


