
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


interface Primefunc{
	boolean func(Integer i);
}
public class Assignment1 {
	public static void main(String[] args) {
		Random rd=new Random();
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<25;i++) {
			arr.add(1+rd.nextInt(50));
		}
		Primefunc getprime=(result)->{
			for(int i=2;i<=result/2;i++) {
				if(result%i==0)
					return false;
			}
			return true;
		};
		arr.forEach(n->{
			if(getprime.func(n))
				System.out.println(n);
		});
	}
	
}
