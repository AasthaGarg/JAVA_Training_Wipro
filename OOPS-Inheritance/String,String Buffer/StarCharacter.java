/*program return a new string in which the following characters are removed-*,
the characters that are to the left and right of * */
public class StarCharacter {
	static void Removed(String str) {
		int idx=str.indexOf('*');
		int n=str.length();
		if(idx>=2) {
			System.out.print(str.substring(0,idx-1));
		}
		if(n-idx>=2) {
			System.out.print(str.substring(idx+2,n));
		}
	}
	public static void main(String args[]) {
		String str="ab*cd";
		Removed(str);
		
	}

}
