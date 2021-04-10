//if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged

public class CheckX {
	public static void main(String args[]) {
		String str="xHix";
		int begin=0;
		int end=str.length();
		
		if(str.length()>0 && str.charAt(0)=='x')
			begin=1;
		if(str.length()>1 && str.charAt(end-1)=='x')
			end--;
		str=str.substring(begin,end);
		System.out.println(str);
	}

}
