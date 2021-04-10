import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment6 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Pihu");
		list.add("Sarakh");
		list.add("Mohit");
		list.add("Sanjay");
		list.add("Prakash");
		list.add("Mishi");
		list.add("Parul");
		list.add("Sumit");
		list.add("Kapil");
		list.add("Manav");
		Consumer<String>c2=i->System.out.println(i);
		Consumer<List<String>> c1=li->{
			for(int i=0;i<li.size();i++) {
				StringBuilder reverse=new StringBuilder(li.get(i)).reverse();
				String ans=reverse.toString();
				li.set(i, ans);
			}
		};
		c1.accept(list);
		list.forEach(n->c2.accept(n));
	}
	

}
