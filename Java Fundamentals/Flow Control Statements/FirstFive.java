class FirstFive{
	public static void main(String args[]){
		int num=1;
		int count=0;
		while(count!=5){
			if(num%2==0 && num%3==0 && num%5==0){
				System.out.print(num+" ");
				count++;
			}
			num++;
		}
	}
}