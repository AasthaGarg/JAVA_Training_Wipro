
public class Calculator {
	
	static int powerInt(int num1,int num2) {
		int ans=(int)Math.pow(num1, num2);
		return ans;
	}
	static double powerDouble(double num1,int num2) {
		double ans=Math.pow(num1, num1);
		return ans;
	}

	public static void main(String[] args) {
		int ans1=Calculator.powerInt(2,3);
        System.out.println(ans1);
        double ans2=Calculator.powerDouble(32.44, 3);
        System.out.println(ans2);
	}

}
