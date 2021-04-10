/*Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero. 

This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .  Use exception handling mechanisms to handle this exception. 

Sample Input and Output 1:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
1
The array element at index 1 = 80
The array element successfully accessed


 Sample Input and Output 2:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
9
java.lang.ArrayIndexOutOfBoundsException


 Sample Input and Output 3:
Enter the number of elements in the array
2
Enter the elements in the array
30
j
java.lang.NumberFormatException*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class Assignment3 {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int size=s.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the elements in the array");
		
		try {
			for(int i=0;i<size;i++) {
				arr[i]=s.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int idx=s.nextInt();
			System.out.println("The array element at index "+idx+" = "+arr[idx]);
			System.out.println("The array element successfully accessed");
		}
		
		catch(InputMismatchException e){
			System.out.println("java.lang.NumberFormatException");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		
		s.close();
	}
	

}
