//program to create n copies of first 2 chars of string

public class CreateCopy {
	static String nCopies(String str,int n) {
		str=str.substring(0,2);
		String ans="";
		for(int i=0;i<n;i++) {
			ans+=str;
		}
		return ans;
	}
	public static void main(String args[]) {
		String str="Wipro";
		String res=nCopies(str,str.length());
		System.out.println(res);
	}

}
