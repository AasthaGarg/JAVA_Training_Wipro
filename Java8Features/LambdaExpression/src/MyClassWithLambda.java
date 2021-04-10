interface WordCount{
	int count(String str);
}
public class MyClassWithLambda{
	public static void main(String[] args) {
		WordCount c=(str)->{
			int result=str.length();
			return result;
		};
		int ans=c.count("Raman");
		System.out.println(ans);
	}

}
