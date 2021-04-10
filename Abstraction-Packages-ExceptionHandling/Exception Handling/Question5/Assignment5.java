/* Write a Program with a division method which receives two integer numbers and performs the division operation. 

The method should declare that it throws ArithmeticException. This exception should be handled in the main method*/
import java.util.Scanner;

public class Assignment5 {
	public static double divison(int num1,int num2) throws ArithmeticException {
		return num1/num2;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		try {
			double ans=divison(num1,num2);
			System.out.println(ans);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		s.close();
	}
}
