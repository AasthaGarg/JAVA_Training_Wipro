import java.util.ArrayList;
import java.util.List;

public class Student {
	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(101,"Mahi",84));
		list.add(new Student(102,"Shari",46));
		list.add(new Student(103,"Varun",50));
		list.add(new Student(104,"Ratan",58));
		list.add(new Student(105,"Shivi",33));
		
		long result=list.stream().filter(stud->stud.marks>49).count();
		System.out.println(result);
	}

}
