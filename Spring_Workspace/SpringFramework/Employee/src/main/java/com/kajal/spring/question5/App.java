package com.kajal.spring.question5;

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
    		Employee emp=context.getBean(Employee.class);
    		emp.display();
    
    }
}
