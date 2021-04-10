import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment1 {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(5);
		list.add(7);
		list.add(-30);
		list.add(-2);
		List<Integer> newList=list.stream().filter(x->(x%2==0 && x<0)).collect(Collectors.toList());
		System.out.println(newList);
	}

}
