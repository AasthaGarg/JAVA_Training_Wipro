package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Player;



public class MainClass {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      Player obj1= (Player)context.getBean("PlayerBean1");
	      System.out.println(obj1);
	      Player obj2= (Player)context.getBean("PlayerBean2");
	      System.out.println(obj2);
	      Player obj3= (Player)context.getBean("PlayerBean3");
	      System.out.println(obj3);
	      Player obj4= (Player)context.getBean("PlayerBean4");
	      System.out.println(obj4);
	      Player obj5= (Player)context.getBean("PlayerBean5");
	      System.out.println(obj5);
	}

}
