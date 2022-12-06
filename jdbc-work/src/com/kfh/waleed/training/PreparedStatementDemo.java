package com.kfh.waleed.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
	
	String qry;
	
	PreparedStatement preparedStatement;
	
	public static final String DB_URLTOCONNECT = "jdbc:mysql://localhost:3306/training_kfh";

	public static final String DB_USERNAME = "root";

	public static final String DB_PASSWORD = "";

	static private Connection dbCon;
	
	private ResultSet resultSet;

	public static void main(String[] args) {
		PreparedStatementDemo ref = new PreparedStatementDemo();

	}
	
	public PreparedStatementDemo() {

		try {
//			Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Try to establish the connection
			dbCon = DriverManager.getConnection(DB_URLTOCONNECT, DB_USERNAME, DB_PASSWORD);

			
//			Scanner scan = new Scanner(System.in);
//			
//			System.out.println("Enter id, name and skills of new developer to register : ");
//			
//			int id = scan.nextInt();
//			scan.nextLine();
//			
//			String name = scan.nextLine();
//			
//			String skills = scan.nextLine();
//			
//			addNewDeveloperDetails(id, name, skills);
			
			readAndUpdateDetails();

//			System.out.println("Successfully connected to the database...");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't load the driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect, some issues  : " + e.getMessage());
		}
	}

	private void addNewDeveloperDetails(int id, String name, String skills) throws SQLException {
		
		qry = "insert into developer values(?, ?, ?)";
		
//		Get a reference to the PreparedStatement object
		preparedStatement =  dbCon.prepareStatement(qry);
		
//		Pass parameters to it
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, skills);
		
//		Execute the query
		if(preparedStatement.executeUpdate() > 0)
			System.out.println("Developer registered...");
		
	}
	
	
	 void readAndUpdateDetails() throws SQLException {
		qry = "select * from developer";
		
		preparedStatement = dbCon.prepareStatement(qry, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			if(resultSet.getString("name").equals("Ahmed")) {
				resultSet.updateString("skills", "Swift");
				
				
//				Commit the changes
				resultSet.updateRow();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
