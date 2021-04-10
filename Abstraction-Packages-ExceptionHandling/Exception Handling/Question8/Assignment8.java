/*Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)*/

class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		super();
	}
	public String toString() {
		return "Age entered is not between (18-60).";
	}
}
public class Assignment8{
	public static void main(String args[]) throws InvalidAgeException{
		String name=args[0];
		int age=Integer.parseInt(args[1]);
		try {
			if(age<18 ||age>=60)
				throw new InvalidAgeException();
			System.out.println("Name: "+name+" Age:"+age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}
}
