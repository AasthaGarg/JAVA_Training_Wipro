class PrimeOrComposite{
	public static void main(String args[]){
		int num=1;
		int flag=1;
		if(num<2){
			System.out.println(num+" is neither prime nor composite");
		}
		else{
			for(int i=2;i<num;i++){
				if(num%i==0){
					flag=0;
					break;
				}
			}
			if(flag==0){
				System.out.println(num+" is not a prime number");
			}
			else{
				System.out.println(num+" is a prime number");
			}
		}
	}
}