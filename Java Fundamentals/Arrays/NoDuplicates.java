class NoDuplicates{
	public static void main(String args[]){
		int arr[]={12,34,12,45,67,89};
		// sort an array
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//remove duplicate
		int temp[]=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				temp[k++]=arr[i];
			}
		}
		for(int i=0;i<k;i++){
			System.out.print(temp[i]+" ");
		}
	}
}