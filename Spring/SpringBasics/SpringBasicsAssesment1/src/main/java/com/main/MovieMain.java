package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Movie;

public class MovieMain{
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      Movie obj = (Movie) context.getBean(Movie.class);
      System.out.println(obj);
   }
}

