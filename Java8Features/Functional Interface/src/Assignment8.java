import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Assignment8 {
	public static void main(String[] args) {
		Supplier<List<Integer>> s1=()->{
			List<Integer> list=new ArrayList<Integer>();
			int n=0,i=1,j=1,ct=0;
			while(n<10) {
				j=1;
				ct=0;
				while(j<=i) {
					if(i%j==0)
						ct++;
					j++;
				}
				if(ct==2) {
					list.add(i);
					n++;
				}
				i++;
			}
			return list;
			
		};
		System.out.println(s1.get());
	}

}
