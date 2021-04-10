class Biggest3D{
	public static void main(String args[]){
		int a=args.length;
		if(a>9 || a<9){
			System.out.println("Please enter 9 integer numbers");
		}
		else{
			int arr[][]=new int[3][3];
			int k=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					arr[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			int big=arr[0][0];
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(arr[i][j]>big)
						big=arr[i][j];
				}
			}
			System.out.println("The biggest number in the given array is "+big);
		}
	}
}