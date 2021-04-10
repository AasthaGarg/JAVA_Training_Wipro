class Present{
	public static void main(String args[]){
		int arr[]={1,4,34,56,7};
		int find=90;
		int flag=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==find){
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println(-1);
		}
	}
}