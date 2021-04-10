import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment7 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("12");
		list.add("44");
		list.add("2");
		list.add("75");
		list.add("33");
		list.add("62");
		list.add("13");
		list.add("0");
		list.add("15");
		list.add("98");
		Consumer<String>c2=i->System.out.println(i);
		Consumer<List<String>> c1=li->{
			for(int i=0;i<li.size();i++) {
				int num=Integer.parseInt(li.get(i));
				String ans="";
				if(num%2==0)
					ans=num+" "+"even";
				else
					ans=num+" "+"odd";
				li.set(i, ans);
			}
		};
		c1.accept(list);
		list.forEach(n->c2.accept(n));
	}

}
