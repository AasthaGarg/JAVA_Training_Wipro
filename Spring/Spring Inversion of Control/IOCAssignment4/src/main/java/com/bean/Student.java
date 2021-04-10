package com.bean;

public class Student {
	public String studentId;
	public String studentName;
	public Test studentTest;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentId, String studentName, Test studentTest) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentTest = studentTest;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Test getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(Test studentTest) {
		this.studentTest = studentTest;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentTest=" + studentTest
				+ "]";
	}
	

}
