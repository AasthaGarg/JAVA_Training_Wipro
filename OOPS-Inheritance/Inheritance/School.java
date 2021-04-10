
//Person
class Person{
	String name;
	String dob;
	Person(String name,String dob){
		this.name=name;
		this.dob=dob;
	}
	//getter
    public String getName() {
    	return name;
    }
    public String getDob() {
    	return dob;
    }
    //setter
    public void setName(String name) {
    	this.name=name;
    }
    public void setDob(String dob) {
    	this.dob=dob;
    }
}
//Teacher
class Teacher extends Person {
	double salary;
	String subject;
	Teacher(String name, String dob,double salary,String subject) {
		super(name, dob);
		this.salary=salary;
		this.subject=subject;
	}
	//getter
    public double getSalary() {
    	return salary;
    }
    public String getSubject() {
    	return subject;
    }
    //setter
    public void setSalary(double salary) {
    	this.salary=salary;
    }
    public void setSubjet(String subject) {
    	this.subject=subject;
    }
}
//Student
class Student extends Person{

	int studentId;
	Student(String name, String dob,int studentId) {
		super(name, dob);
		this.studentId=studentId;
	}
	//getter
    public int getstudentId() {
    	return studentId;
    }
  //setter
    public void setstudentId(int studentId) {
    	this.studentId=studentId;
    }
}
//CollegeStudent
class College_Student extends Student{
	String collegeName;
    String year;
	College_Student(String name, String dob, int studentId,String collegeName,String year) {
		super(name, dob, studentId);
		this.collegeName=collegeName;
		this.year=year;
	}
	//getter
    public String getcollegeName() {
    	return collegeName;
    }
    public String getyear() {
    	return year;
    }
  //setter
    public void setcollegeName(String collegeName) {
    	this.collegeName=collegeName;
    }
    public void setyear(String year) {
    	this.year=year;
    }
}
public class School {

	public static void main(String[] args) {
		Person p=new Person("Rashi","22/10/1996");                     //Person
	    System.out.println("Person name:"+p.getName());
	    System.out.println("Person dob:"+p.getDob());
	    Teacher t=new Teacher("Manya","12/03/1983",40000,"English");    //Teacher
	    System.out.println("Teacher name:"+t.getName());
	    System.out.println("Teacher dob:"+t.getDob());
	    System.out.println("Teacher salary:"+t.getSalary());
	    System.out.println("Subject name:"+t.getSubject());
        Student s=new Student("Reema","22/08/1997",121);                  //Student
        System.out.println("Student name:"+s.getName());
	    System.out.println("Student dob:"+s.getDob());
	    System.out.println("Student I'd:"+s.getstudentId());
	    College_Student c=new College_Student("Manish","22/11/1994",1234,"BCET,gurdaspur","fourth");     //CollegeStudent
	    c.setName("Praveen");      
	    System.out.println("College student name:"+c.getName());
	    System.out.println("College student dob:"+c.getDob());
	    System.out.println("College student I'd:"+c.getstudentId());
	    System.out.println("College name:"+c.getcollegeName());
	    System.out.println("Year:"+c.getyear());
	}

}
