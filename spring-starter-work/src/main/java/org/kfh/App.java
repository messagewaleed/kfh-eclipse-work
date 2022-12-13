package org.kfh;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

//      1.Load the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

//        Get a reference to the bean
        Engineer engineer = context.getBean("theEngineer", Engineer.class);
        Engineer otherEngineer = context.getBean("theEngineer", Engineer.class);

        System.out.println(engineer == otherEngineer);//false, scope : prototype

//        Call methods on the bean
       // engineer.workForWages();





    }
}
