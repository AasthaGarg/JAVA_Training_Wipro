package com.bean;

public class Test {
	public String testId;
	public String testTitle;
	public String testMarks;
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(String testId, String testTitle, String testMarks) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testMarks = testMarks;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public String getTestMarks() {
		return testMarks;
	}
	public void setTestMarks(String testMarks) {
		this.testMarks = testMarks;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testTitle=" + testTitle + ", testMarks=" + testMarks + "]";
	}
	

}
