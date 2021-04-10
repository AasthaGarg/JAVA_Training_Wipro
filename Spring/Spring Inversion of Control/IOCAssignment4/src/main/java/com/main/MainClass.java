package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;



public class MainClass {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      Student obj1= (Student)context.getBean("studentBean1");
	      System.out.println(obj1);
	      Student obj2 = (Student)context.getBean("studentBean2");
	      System.out.println(obj2);
	}

}
