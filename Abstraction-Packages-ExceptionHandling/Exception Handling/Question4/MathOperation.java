/* Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result. 

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.*/
import java.util.InputMismatchException;

public class MathOperation {
	public static void main(String args[]) {
		int n=args.length;
		for(int i=0;i<n;i++) {
			if(args[i].charAt(args[i].length()-1)==',')
				args[i]=args[i].replace(",","");
		}
		int[] arr=new int[n];
		int sum=0;
		double avg=0;
		try {
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(args[i]);
			}
			for(int i=0;i<n;i++)
				sum+=arr[i];
			avg=sum/n;
			System.out.println("Sum is:"+sum);
			System.out.println("Average is:"+avg);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
	}
}
