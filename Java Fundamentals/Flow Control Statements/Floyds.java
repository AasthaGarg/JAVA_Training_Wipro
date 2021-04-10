import java.util.Scanner;
class Floyds{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String data=s.nextLine();
		int i,j;
		if(data.equals("")){
			System.out.println("Please enter an integer number");
		}
		else{
			int num=Integer.parseInt(data);
			for(i=1;i<=num;i++){
				for(j=1;j<=i;j++){
					System.out.print("*"+" ");
				}
				System.out.print("\n");
			}
		}
	}
}