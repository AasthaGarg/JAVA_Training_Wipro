class Palindrome{
	public static void main(String args[]){
		Integer num=111011;
		Integer digit=num;
		Integer rev=0;
		while(num!=0){
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		if(digit.equals(rev)){
			System.out.println(digit+" is a palindrome");
		}
		else{
			System.out.println(digit+" is not a palindrome");
		}
	}
}