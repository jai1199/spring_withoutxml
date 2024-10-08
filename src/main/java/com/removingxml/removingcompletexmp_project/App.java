package com.removingxml.removingcompletexmp_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started!" );
        ApplicationContext con = new AnnotationConfigApplicationContext(Pizzaconfig.class);
        Pizza p = con.getBean("dominoz",Pizza.class);
        System.out.println(p);
        p.deliver();
        System.out.println("program ended");
    }
}
