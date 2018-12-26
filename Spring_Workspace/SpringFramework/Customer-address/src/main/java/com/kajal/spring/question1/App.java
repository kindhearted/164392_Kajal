package com.kajal.spring.question1;

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
    		Customer customer=context.getBean(Customer.class);
    		customer.displayInfoOfCustomer();
    
    
    }
}
