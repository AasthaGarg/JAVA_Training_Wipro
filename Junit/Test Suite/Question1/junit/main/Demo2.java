package junit.main;


public class Demo2 {
	public boolean palindromeCheck(String a) {
		int length=a.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		if(a.equals(rev))
			return true;
		else
			return false;
	}

}
