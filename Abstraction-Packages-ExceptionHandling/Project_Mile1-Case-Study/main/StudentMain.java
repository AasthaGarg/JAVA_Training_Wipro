package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain{
	static Student data[]=new Student[9];
	static {
		for(int i=0;i<data.length;i++) 
			data[i]=new Student();
		data[0]=new Student("Sekar",new int[] {35,35,35});
		data[1]=new Student(null,new int[] {11,22,33});
		data[2]=null;
		data[3]=new Student("Manoj",null);
		data[4]=new Student("Pankaj",new int[] {90,88,94});//testcase1
		data[5]=new Student("Rashi",new int[] {72,73,74});//testcase2
		data[6]=new Student("Venkat",new int[] {13,88,13});//testcase3
		data[7]=new Student("Divya",new int[] {50,50,55});//testcase4
		data[8]=null;//testcase5
		
		
	}
	public static void main(String args[]) {
		StudentReport studentReport=new StudentReport();
		StudentService studentService=new StudentService();
		System.out.println("Grade Calculation:");
		String x=null;
		for(int i=0;i<data.length;i++) {
			try {x=studentReport.validate(data[i]);}
			catch(NullNameException e) {x="NullNameException occurred";}
			catch(NullMarksArrayException e) {x="NullMarksArrayException occurred";}
			catch(NullStudentException e) {x="NullStudentException occurred";}
			System.out.println("GRADE="+x);
		}
		System.out.println("Number of Objects with Marks array as null="
		+studentService.findNumberOfNullMarks(data));
		System.out.println("Number of Objects with Name as null="
				+studentService.findNumberofNullNames(data));
		System.out.println("Number of Objects that are entirely null="
				+studentService.findNumberOfNullObjects(data));
	}
}