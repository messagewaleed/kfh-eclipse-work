package org.kfh;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

//      1.Load the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsConfig.xml");

//        Get a reference to the bean
//        Engineer engineer = context.getBean("theEngineer", SoftwareEngineer.class);
//        Engineer otherEngineer = context.getBean("theEngineer", SoftwareEngineer.class);

        //System.out.println(engineer == otherEngineer);//false, scope : prototype

        Engineer engineer = context.getBean("anEngineer", AnnotationsEngineer.class);


//        Call methods on the bean
        engineer.workForWages();





    }
}
