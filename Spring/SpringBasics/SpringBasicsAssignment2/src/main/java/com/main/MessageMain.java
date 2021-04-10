package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.DefaultMessage;



public class MessageMain {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      DefaultMessage obj = (DefaultMessage) context.getBean(DefaultMessage.class);
	      System.out.println(obj.getMessage());
	   }

}
