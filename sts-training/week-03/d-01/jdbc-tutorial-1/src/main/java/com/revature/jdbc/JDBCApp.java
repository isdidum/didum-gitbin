//package com.revature.factory;
package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.postgresql.Driver;

import com.revature.callable.Callable;

public class JDBCApp{
	
	public static void main(String args[]) {
		//postgres is the name of the database
		//postgresql is the actual database type
		String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
		String dbUsername = "postgres";
		String dbPassword = "didum13";
	
		Callable call = new Callable();
	
		//Register the driver
		Driver drPostgres = new Driver();
		try {
			DriverManager.registerDriver(drPostgres);
			Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			
			call.println(con); //called from Callable
			
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM public.students");
			ResultSet rs = stmt.executeQuery();
			
			while( rs.next() ) {
				int studentId = rs.getInt(1);
				String fName = rs.getString(2);
				String lName = rs.getString(3);
				String classify = rs.getString(4);
				int age = rs.getInt(5);
				
				call.println("id = "+studentId+" first-name = "+fName+" last-name = "+lName+" classification = "+classify+" age = "+age);
			}
		} catch(SQLException err) {
			err.printStackTrace();
		}
	
	}
}

