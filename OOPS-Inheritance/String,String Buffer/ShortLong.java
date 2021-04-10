//return a new string of the form short+long+short

public class ShortLong {
	public static void main(String args[]) {
		String a="hi";
		String b="hello";
		int n1=a.length();
		int n2=b.length();
		if(n1<n2) {
			System.out.println(a+b+a);
		}
		else {
			System.out.println(b+a+b);
		}
	}

}
