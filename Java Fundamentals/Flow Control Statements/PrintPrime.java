class PrintPrime{
	public static void main(String args[]){
		int prime;
		for(int i=10;i<=99;i++){
			prime=1;
			for(int j=2;j<i;j++){
				if(i%j==0){
					prime=0;
					break;
				}
			}
			if(prime==1){
				System.out.print(i+" ");
			}
		}
	}
}