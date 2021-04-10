interface ref{
	int count(int num);
}
public class Assignment2 {
	public static int digitCount(int n) {
		String num=Integer.toString(n);
		int len=num.length();
		return len;
	}
	public static void main(String[] args) {
		ref myref=Assignment2::digitCount;
		System.out.println(myref.count(1348));
	}

}
