interface iface{
	int fact(int num);
}
public class Assignment1 {
	
	public int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		Assignment1 obj=new Assignment1();
		iface reference=obj::factorial;
		System.out.println(reference.fact(4));
	}

}
