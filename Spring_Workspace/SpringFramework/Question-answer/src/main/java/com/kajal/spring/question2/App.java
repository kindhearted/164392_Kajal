package com.kajal.spring.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    		Question question=(Question)context.getBean("questionList");
    		question.showQuestionList();
    		
    		
    		Question question1=(Question)context.getBean("questionSet");
    		question1.showQuestionSet();
    		
    		
    		Question question2=(Question)context.getBean("questionMap");
    		question2.showQuestionMap();
    		
    		
   
    }
}
