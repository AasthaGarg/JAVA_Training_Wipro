//program that will return the first half of the string, if the length of the string is even

public class FirstHalf {
	static String Check(String str,int n) {
		if(n%2==0) {
			str=str.substring(0,n/2);
			return str;
		}
		return null;
	}
	public static void main(String args[]) {
		String str="TomCat";
		String ans=Check(str,str.length());
		System.out.println(ans);
	}

}
