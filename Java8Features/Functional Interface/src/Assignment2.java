import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface iface{
	int sum(List<Integer> list);
}
public class Assignment2 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
	    iface i=res->{
	    	int total=0;
	    	for(Integer element:list) {
	    		total+=element;
	    	}
	    	return total;
	    };
	    int ans=i.sum(list);
		System.out.println(ans);
	}

}
