package org.kfh;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

@Configuration
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

    @Bean
    public List<String> getNames(){
        return Arrays.asList("Ahmed", "Dalal", "Zahem");
    }
//
//    @Bean
//    public String getMessage(){
//        return "A good day...";
//    }



}
