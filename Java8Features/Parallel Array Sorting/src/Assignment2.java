import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
	    char arr[]=input.toCharArray();
	    Arrays.parallelSort(arr);
	    String output="";
	    for(int i=0;i<arr.length;i++) {
	    	output+=arr[i];
	    }
	   
	    System.out.println(output);
	    sc.close();
	}

}
