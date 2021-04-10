class Sum{
	public static void main(String args[]){
		int arr[]={10,3,6,1,2,7,9};
		int l=-1;
		int r=-1;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==6){
				l=i;
			}
			if(arr[i]==7){
				r=i;
			}
			sum+=arr[i];
		}
		if(l>-1 && r>-1 && l<r){
			sum=0;
			for(int i=0;i<l;i++){
				sum+=arr[i];
			}
			for(int i=r+1;i<arr.length;i++){
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}