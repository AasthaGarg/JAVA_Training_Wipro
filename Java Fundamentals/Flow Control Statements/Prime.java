import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		int flag=1;
	    int num;
	    Scanner s=new Scanner(System.in);
	    num=s.nextInt();
	    if(num<2){
		    System.out.println("Not Prime");
     	}
	    else{
		    for(int i=2;i<num;i++){
			    if(num%i==0){
				    flag=0;
				    break;
                }
		    }
		    if(flag==1){
			    System.out.println("Prime");
		    }
		    else{
			    System.out.println("Not Prime");
		    }
	    }
		
	}
	
}