import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Assignment5 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(9);
		list.add(64);
		list.add(6);
		list.add(10);
		
		Predicate<Integer> pre=x->{
			for(int i=1;i<=x;i++) {
				if(i*i==x)
					return true;
			}
			return false;
		};
		list.stream().filter(pre).forEach(System.out::println);
	}

}
