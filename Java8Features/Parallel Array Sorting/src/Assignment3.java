import java.util.Arrays;

public class Assignment3 {
	public static void main(String[] args) {
		int arr[]=new int[] {5,2,8,1,4,3,13,0,7,3};
		Arrays.parallelSort(arr,0,5);
		for(int i:arr)
			System.out.print(i+" ");
		
	}

}
