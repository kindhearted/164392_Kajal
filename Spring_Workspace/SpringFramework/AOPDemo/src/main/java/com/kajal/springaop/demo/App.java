package com.kajal.springaop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    		ShapeService shapeService=context.getBean(ShapeService.class);
    		System.out.println(shapeService.getTriangle().getName());
      
    }
}


