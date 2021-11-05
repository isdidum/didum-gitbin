package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.postgresql.Driver;

public class JDBCUtility {
	public static Connection getConnection() throws SQLException {
		//postgres is the name of the database
		//postgresql is the actual database type
		String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
		String dbUsername = "postgres";
		String dbPassword = "didum13";
		
		//Register the driver
		Driver drPostgres = new Driver();
		DriverManager.registerDriver(drPostgres);
		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		return con;
	}
}
