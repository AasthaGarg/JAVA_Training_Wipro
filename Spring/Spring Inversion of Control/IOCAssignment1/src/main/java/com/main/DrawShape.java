package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Parallelogram;
import com.bean.Rectangle;
import com.bean.Shape;
import com.bean.Triangle;


public class DrawShape {
	public static void main(String args[]) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      Shape obj1 = (Shape) context.getBean(Rectangle.class);
	      obj1.draw();
		  Shape obj2=(Shape) context.getBean(Triangle.class);
		  obj2.draw();
		  Shape obj3=(Shape) context.getBean(Parallelogram.class);
		  obj3.draw();
	}

}
