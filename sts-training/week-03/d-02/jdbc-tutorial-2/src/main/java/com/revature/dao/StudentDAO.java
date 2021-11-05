package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Date;
import java.sql.Date;
import java.util.List;

import com.revature.dto.StudentDTO;
import com.revature.model.Student;
import com.revature.util.JDBCUtility;

/*
 * Three tiered Architecture
 * 1. Controller Layer
 * 		- interface with service layer
 * 		- contains the controllers that receive the HTTP request and extract information form the requests
 * 2. Service Layer 
 * 		- interact with the Data-Access-Layer
 * 		- contains the business logic such as validating proper inputs, processing data, etc.
 * 3. Data Access Layer
 * 		- DAO (data access object): contains the methods to perform CRUD operations
 * 		- CRUD: Create, Read, Update, & Delete
 * 		- utilizes JDBC (Java Database Connectivity API)
 */
public class StudentDAO {
	//public Student addStudent(Student stu) throws SQLException {
	public Student addStudent(StudentDTO stu) throws SQLException {
		//try-with-resources: application to automatically call the .close() method
		//regardless of whether an exception occurs or the block ends without an exception
		try(Connection con = JDBCUtility.getConnection()){
			//concatenate a string to be added back into the database
			String sql = "INSERT INTO public.students (first_name, last_name, classification, student_age, entry_date) "
					+ "VALUES (?, ?, ?, ?, ?)"; //?question-marks are placed holders for our prepared-statement
			
			PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			//primary key id is serial, hence, has auto-increment, we don't need to temper with that.
			stm.setString(1, stu.getFirstName()); //first-name column
			stm.setString(2, stu.getLastName()); //last-name column
			stm.setString(3, stu.getClassify()); //classification column
			stm.setInt(4, stu.getAge()); //student-age column
			stm.setDate(5, stu.getEntryDate()); 
			//stm.setString(5, stu.getEntryDate());	//student_date column
			
			//executeUpdate() returns an integer
			int recordInserted = stm.executeUpdate(); //
			
			if( recordInserted != 1 ) {
				throw new SQLException("Unable to add a new student record");
			}
			
			ResultSet rs = stm.getGeneratedKeys();
			rs.next(); //iterate to the first-row
			int idAuto = rs.getInt(1); //1 here = first-column
			return new Student(idAuto, stu.getFirstName(), stu.getLastName(), stu.getClassify(), stu.getAge(), stu.getEntryDate());
		}
	}
	
	/*
	 * highlight then 'ctrl + /' to apply single line comments 
	 */
	public List<Student> getAllStudents() throws SQLException {
		//queried information from the database will be stored in this List Object
		List<Student> stuList = new ArrayList<>();
		
		try(Connection con = JDBCUtility.getConnection()){
			//use Statement, PreparedStatement, CallableStatement
			String sql = "SELECT * FROM public.students";
			PreparedStatement stm = con.prepareStatement(sql);
			
			//Execute the query: ResultSet is a pointer to the data that was queried
			ResultSet rs = stm.executeQuery();
			
			while( rs.next() ) {
				int id = rs.getInt("student_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String classification = rs.getString("classification");
				int age = rs.getInt("student_age");
				//String date = rs.getString("entry_date");
				Date date = rs.getDate("entry_date");
				
				//pass the grabbed information to student object
				Student stu = new Student(id, firstName, lastName, classification, age, date);
				stuList.add(stu);
			}
			
		}
		return stuList;
	}
	
	public Student getStudentById(int id) throws SQLException {
		try(Connection con = JDBCUtility.getConnection()){
			String sql ="SELECT * FROM public.students WHERE student_id = ?";
			
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, id); //pass the value of the id-variable into the 1st question mark
			
			ResultSet rs = stm.executeQuery();
			if( rs.next() ) {
				return new Student(
					rs.getInt("student_id"), rs.getString("first_name"), rs.getString("last_name"),
					rs.getString("classification"), rs.getInt("student_age"), rs.getDate("entry_date") 
				); //rs.getString("entry_date")
			} //else {return null;}
			
			return null;
		}
	}
	
	 public Student updateStudent(int stuID, StudentDTO stu) throws SQLException {
		 try(Connection con = JDBCUtility.getConnection()){
			 String sql = "UPDATE public.students "
			 		+ "	SET first_name = ?,"
			 		+ "	    last_name = ?,"
			 		+ "	    classification = ?,"
			 		+ "	    student_age = ?,"
			 		+ "	    entry_date = ?"
			 		+ "WHERE "
			 		+ "student_id = ?;";
			 
			 PreparedStatement stm = con.prepareStatement(sql);
			 stm.setString(1, stu.getFirstName());
			 stm.setString(2, stu.getFirstName());
			 stm.setString(3, stu.getClassify());
			 stm.setInt(4, stu.getAge());
			 stm.setDate(5, stu.getEntryDate());
			 stm.setInt(6, stuID); //updating this student id
			 
			 int recordUpdated = stm.executeUpdate();
			 if( recordUpdated != 1 ) {
				 throw new SQLException("Unable to update student with id of "+ stuID);
			 }
		 }
		 return new Student(stuID, stu.getFirstName(), stu.getLastName(), stu.getClassify(), stu.getAge(), stu.getEntryDate());
	 }
	 
//	 public void deleteStudentById(int id) throws SQLException {
//		 try(Connection con = JDBCUtility.getConnection()) {
//				//
//		 }
//	 }
	 
//	 public void deleteAllStudents() throws SQLException {
//		 try(Connection con = JDBCUtility.getConnection()) {
//				//
//		 }
//	 }
}
