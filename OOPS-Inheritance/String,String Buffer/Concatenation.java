//program to concatenate 2 strings and return result.

public class Concatenation {
	public static void main(String args[]) {
		String str1="Mark";
		String str2="Kate";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int n=str1.length();
		if(str1.charAt(n-1)==str2.charAt(0)) {
			str2=str2.substring(1);
		}
		str1=str1.concat(str2);
		System.out.println(str1);
	}

}
