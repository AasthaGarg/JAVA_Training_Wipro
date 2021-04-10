//program that accepts a string and returns a new string without the first and last character of the input string
import java.util.Scanner;
public class NewString {

	private static Scanner scanner;

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		String str=scanner.nextLine();
		int n=str.length();
		str=str.substring(1,n-1);
		System.out.println(str);
	}
}
