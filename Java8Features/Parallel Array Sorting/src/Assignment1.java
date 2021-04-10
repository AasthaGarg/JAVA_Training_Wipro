import java.util.Arrays;

public class Assignment1 {
	public static void main(String[] args) {
		int arr[]=new int[] {5,2,8,1,9,3,13,0,7,3};
		Arrays.parallelSort(arr);
		int sum=arr[0]+arr[9];
		System.out.println(sum);
	}

}
