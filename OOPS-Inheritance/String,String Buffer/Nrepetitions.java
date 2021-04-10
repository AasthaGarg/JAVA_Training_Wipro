//printing a new string made of n repetitions of the last n characters of the string

public class Nrepetitions {
	public static String Repeted(String str,int n) {
		String ans="";
		int len=str.length();
		if(len>=n) {
			for(int i=0;i<n;i++) {
				ans+=str.substring(len-n);
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		String str="Wipro";
		int n=3;
		String ans=Repeted(str,n);
		System.out.println(ans);
	}
}
