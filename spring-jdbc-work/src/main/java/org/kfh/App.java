package org.kfh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
//    Load the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        DbOperations dbConnect = context.getBean("dbOperations", DbOperations.class);

//        System.out.println("Number of developers : " + dbConnect.getNumberOfDevelopers());

//        System.out.println("Enter id");

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please enter developer name and skills");
//
//        dbConnect.addNewDeveloper(new Developer(scan.nextLine(), scan.nextLine()));
//
//
//        int id = new Scanner(System.in).nextInt();
//
//        System.out.println(dbConnect.getDeveloperNameById(id));

//        System.out.println("Current registered developers :");
//
        dbConnect.getAllDevelopers().forEach(System.out::println);

//        System.out.println(dbConnect.getDeveloperDetailsById(id));






    }
}
