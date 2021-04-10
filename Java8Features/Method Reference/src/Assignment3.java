interface reference{
	void isPrime(int n);
}
public class Assignment3 {
	
	Assignment3(int n) {
		int flag=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=0;
				break;
			}
		}
		if(flag==0)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
		
	}
	
	public static void main(String[] args) {
		
		reference ref=Assignment3::new;
		ref.isPrime(13);
	}

}
