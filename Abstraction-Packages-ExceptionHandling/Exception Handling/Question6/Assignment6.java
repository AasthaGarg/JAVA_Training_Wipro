/*Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)*/

import java.util.Scanner;
class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		super();
	}
	public String toString() {
    	return "NegativeValuesException occurred";
    }
}
class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		super();
	}
    public String toString() {
    	return "ValuesOutOfRangeException occurred";
    }
}
public class Assignment6 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			String name="";
			int subA=0;
			int subB=0;
			int subC=0;
			try {
				name=s.next();
				if(s.hasNextInt())
					subA=s.nextInt();
				else
					throw new NumberFormatException();
				if(s.hasNextInt())
					subB=s.nextInt();
				else
					throw new NumberFormatException();
				if(s.hasNextInt())
					subC=s.nextInt();
				else
					throw new NumberFormatException();
				
				if(subA<0)throw new NegativeValuesException();
				if(subA>100)throw new ValuesOutOfRangeException();
				
				if(subB<0)throw new NegativeValuesException();
				if(subB>100)throw new ValuesOutOfRangeException();
				
				if(subC<0)throw new NegativeValuesException();
				if(subC>100)throw new ValuesOutOfRangeException();
				
				System.out.println("Name is:"+name);
				System.out.println("Average of student "+name+" is:"+(subA+subB+subC)/3);
			}
			catch(NumberFormatException e){
				System.out.println(e);
			}
			catch(NegativeValuesException e) {
				System.out.println(e);
			}
			catch(ValuesOutOfRangeException e) {
				System.out.println(e);
			}
			
		}
		s.close();
	}
}
