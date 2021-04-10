interface Test{
	public int myFunction(int a,int b,int c);
	
}
public class TestInterface {
	public static void main(String[] args) {
		Test t1=(a,b,c)->(a+b+c);
		Test t2=(a,b,c)->(a*b*c);
		int res1=t1.myFunction(2, 3, 4);
		int res2=t2.myFunction(2, 3, 5);
		System.out.println("After calling t1 reference: "+res1);
		System.out.println("After calling t2 reference; "+res2);
	}
}
