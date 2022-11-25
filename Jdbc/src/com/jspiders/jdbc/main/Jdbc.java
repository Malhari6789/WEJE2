package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
		try {
			// step 1: Load the driver class.
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			//step 2: open the connection.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2? user=root & password=root");

			//step 3: prepare / create the statement.
			
			Statement  statement= connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student");
			
			//step 4: Process the result.
			while(resultSet.next()) {
				System.out.println(
								resultSet.getString(1)+ " || " +
								resultSet.getString(2)+ " || " +
								resultSet.getString(3));
			}
			//step 5:Close the connection.
			connection.close();
			statement.close();
			resultSet.close();
		}
	   catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   } catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
