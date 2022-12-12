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

//        Call methods on the bean
        engineer.workForWages();

//        Without spring
//        Engineer engineer = new Engineer(78, "Sarah", "Java, JSP, .Net, HTML, CSS, Spring");
//
//        engineer.workForWages();






    }
}
