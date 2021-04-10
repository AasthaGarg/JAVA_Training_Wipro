package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.SetterMessage;



public class MainMessage {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      SetterMessage obj = context.getBean(SetterMessage.class);
	      System.out.println(obj.getMessage());
	}

}
