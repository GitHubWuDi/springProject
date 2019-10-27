package com.vrv.spring.springProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrv.spring.springProject.bean.Message;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");          
        Message message = (Message) context.getBean("message");   
        message.printMessage();  
    }
}
