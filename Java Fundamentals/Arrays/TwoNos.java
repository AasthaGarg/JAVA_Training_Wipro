class TwoNos{
	public static void main(String args[]){
		int arr[]={23,32,4,-8,66,999};
		int large1=arr[0];
		int large2=arr[0];
		int small1=arr[0];
		int small2=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>large1){
				large2=large1;
				large1=arr[i];
			}
			else if(arr[i]>large2 && arr[i]!=large1){
				large2=arr[i];
			}
			if(arr[i]<small1){
				small2=small1;
				small1=arr[i];
			}
			else if(arr[i]<small2 && arr[i]!=small1){
				small2=arr[i];
			}
		}
		System.out.println("Large1 "+large1+" Large2 "+large2+
		" Small1 "+small1+" Small2 "+small2);
	}
}