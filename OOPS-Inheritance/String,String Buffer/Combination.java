//print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on

public class Combination {
	public static String giveCombination(String a,String b) {
		int n=a.length();
		int m=b.length();
		String ans="";
		for(int i=0;i<n||i<m;i++) {
			if(i<n)
				ans+=a.charAt(i);
			if(i<m)
				ans+=b.charAt(i);
		}
		return ans;
	}
	public static void main(String args[]) {
		String a="Hello";
		String b="World";
		String ans=giveCombination(a,b);
		System.out.println(ans);
	}

}
