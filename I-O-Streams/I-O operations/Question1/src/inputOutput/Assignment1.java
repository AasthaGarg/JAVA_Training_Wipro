/*Write a program to count the number of times a character appears in a File. 

[Note :  The character check is case insensitive... i.e, 'a' and 'A' are considered to be the same]

Sample Input and Output:
Enter the file name
Input.txt
Enter the character to be counted
r
File 'Input.txt' has 99 instances of letter 'r'.*/
package inputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Assignment1 {
	public static void main(String args[]) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename=sc.nextLine();
		System.out.println("Enter the character to be counted");
		char need=sc.nextLine().charAt(0);
		File file=new File(filename);
		int charCount=0;
		BufferedReader br=new BufferedReader(new FileReader(file));
		int ch;
		do {
			ch=br.read();
			if(ch>=65 && ch<=90)ch+=32;
			if(need>=65 && need<=90)ch+=32;
			if(ch==need)
				charCount++;
			
		}while(ch!=-1);
		System.out.println("File '"+filename+" 'has "+charCount+" instance of letter '"+need+"'.");
		br.close();
		sc.close();
	}

}
