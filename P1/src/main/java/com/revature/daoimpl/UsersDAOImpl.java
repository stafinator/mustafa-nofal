package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Users;
import com.revature.dao.UserDAO;
import com.revature.util.ConnFactory;

public class UsersDAOImpl implements UserDAO {

	public static ConnFactory cf= ConnFactory.getInstance();
	public static Connection conn = cf.getConnection();


	public void createUser(Users users) throws SQLException {
		// TODO Auto-generated method stub
		//int user_id = users.getUser_id();
		String username = users.getUsername();
		String password = users.getPassword();
		String firstname = users.getFirstname();
		String lastname = users.getLastname();
		String email = users.getEmail();
		int user_tier = users.getUser_tier();
		
	//we use prepared statements bc they are faster and more secure
	// you would only use a STATEMENT for SELECT otherwise you 
	// are open to SQL Injection which can crash you program 
	// and steal peoples data, or messup your code
	// and its much better for updating info.
	
		
		String sql = "INSERT INTO ERS_USERS(users_username,users_password, users_firstname, users_lastname, users_email, users_tier) VALUES(?,?,?,?,?,?)";
	
		PreparedStatement stmt;
		
		stmt = conn.prepareStatement(sql);
		
		//when we set the parameters, we match the value to the index according 
		// to the question array in the SQL string above, SQL index starts at 1
		//stmt.setInt(1, user_id);
		stmt.setString(1, username);
		//we really could also put users.getUsername instead of the username variable in beans
		//the reason we do it this way is to stick to the design pattern, easier and better this way.
		stmt.setString(2,password);
		stmt.setString(3, firstname);
		stmt.setString(4, lastname);
		stmt.setString(5, email);
		stmt.setInt(6, user_tier);
		stmt.execute();
		// insert and save ....
		
	}
	
	
	public Users getUser(String username) {
	 Users user = new Users();
		String sql="select USERS_USERNAME, USERS_PASSWORD, USERS_ID from ers_users where USERS_USERNAME = ?";
		
		PreparedStatement stmt;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			
			ResultSet rs=stmt.executeQuery();
			
			
			while(rs.next()) {
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setUser_id(rs.getInt(3));
		
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return user;
	}
	
	

}
