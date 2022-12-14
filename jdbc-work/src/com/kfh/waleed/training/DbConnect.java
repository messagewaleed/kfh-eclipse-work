package com.kfh.waleed.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnect {

	public static final String DB_URLTOCONNECT = "jdbc:mysql://localhost:3306/training_kfh";

	public static final String DB_USERNAME = "root";

	public static final String DB_PASSWORD = "";

	static private Connection dbCon;

	private static String qry;

	private static Statement theStatement;

	private static ResultSet resultSet;

	public static void main(String[] args) {

		try {
//			Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Try to establish the connection
			dbCon = DriverManager.getConnection(DB_URLTOCONNECT, DB_USERNAME, DB_PASSWORD);

//Get a reference to the Statement
			theStatement = dbCon.createStatement();

//			getAllDeveloperData();
			
			Scanner scan = new Scanner(System.in);
//			
//			System.out.println("Enter id to search");
//			
//			int id = scan.nextInt();
//			
//			getDeveloperDetailsById(id);
			
			System.out.println("Enter id, name and skills of new developer to register : ");
			
			int id = scan.nextInt();
			scan.nextLine();
			
			String name = scan.nextLine();
			
			String skills = scan.nextLine();
			
			addNewDeveloperDetails(id, name, skills);

//			System.out.println("Successfully connected to the database...");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't load the driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect, some issues  : " + e.getMessage());
		}

	}

//	Fetch all details of all developers
	static void getAllDeveloperData() {
//		Write the query
		qry = "select * from developer";
		

		try {

			
//			Execute the query
			resultSet = theStatement.executeQuery(qry);
			
//			Traverse through the results
			while(resultSet.next()) {
				System.out.print(resultSet.getString("name"));
				System.out.print(" id: " + resultSet.getInt("id"));
				System.out.println(" with skills : " + resultSet.getString("skills"));
			}
		
			
		} catch (SQLException e) {
			System.out.println("Issues : " + e.getMessage());
		}
		finally{
			
//			Close the connection
//			dbCon.close();
		}
		
		
//		try(BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))){
//			
//		}
//		
		
	}

//	Get all developer details by id
	static void getDeveloperDetailsById(int id) throws SQLException {
		qry = "select * from developer where id = " + id;

//		Execute the query
		resultSet = theStatement.executeQuery(qry);
		

//		 Traverse through the resultSet
		while(resultSet.next()) {
			System.out.print(resultSet.getString("name"));
			System.out.println(" with skills : " + resultSet.getString("skills"));
		}
	}
	
	
//	Add new Developer data
	static void addNewDeveloperDetails(Integer id, String name, String skills) throws SQLException {
//		qry = "insert into developer values('" + id + "', '" + name + "', '" + skills + "')";
		qry = String.format("insert into developer values(%d,'%s', '%s')", id, name, skills);
		
		System.out.println(qry);
		
//		Execute the query
		if(theStatement.executeUpdate(qry) > 0)
			System.out.println("New Developer details added...");
	}

}
