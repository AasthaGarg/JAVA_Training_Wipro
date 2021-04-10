package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.ConstructorMessage;


public class MainMessage {
	
	public static void main(String args[]) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      ConstructorMessage obj = (ConstructorMessage) context.getBean(ConstructorMessage.class);
	      System.out.println(obj.getMessage());
	}

}
