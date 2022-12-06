package com.kfh.training;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
//       Load the Driver
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	System.out.println("Loaded the driver");
    }
}
