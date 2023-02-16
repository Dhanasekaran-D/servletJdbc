package com.servlet.jdbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.servlet.jdbc.dto.Sudents;

public class RegisterDao {
	 private static String dburl="jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj";
	 private static String dbuname="mysql_demo_tnj";
	 private static String dbpassword= "Ebrain@20";
	 private String dbdriver="com.mysql.cj.jdbc.Driver";
	 public void loadDriver(String  dbdriver) {
	 try {
		Class.forName(dbdriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }
	 public static Connection getConnection() {
		 Connection conn=null;
		  
	try {
		conn=DriverManager.getConnection(dburl, dbuname, dbpassword);
		System.out.println("connection Successfully.....");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return conn;
		 
	 }

	public String save(Sudents member) {
		 loadDriver(dbdriver);
		 Connection conn=getConnection();
		 String result="value entered Successfully";
		 String sql="insert into tb_dhanasekaran_sdutent_details(sdu_name,father_name,sdu_class,phone,city,state,country) values (?,?,?,?,?,?,?)";
		 
		 try {
			PreparedStatement ps=conn.prepareCall(sql);
			ps.setString(1,member.getSdu_name());
			//ps.setString(1,member.getRollno());
			ps.setString(2,member.getFather_name());
			ps.setString(3,member.getSdu_class());
			ps.setString(4,member.getPhone());
			ps.setString(5,member.getCity());
			ps.setString(6,member.getState());
			ps.setString(7,member.getCountry());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="value not entered";
		}
		// TODO Auto-generated method stub
		return result;
	} 
	
	public static List<Sudents> getAll() throws ClassNotFoundException, SQLException {

		Connection connection = null;
		try {
			connection = getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String insertQuery = "select sdu_name,father_name,sdu_class,phone,city,state,country) from tb_dhanasekaran_sdutent_details	";
		PreparedStatement ps = connection.prepareStatement(insertQuery);
		ResultSet rs = ps.executeQuery();
		System.out.println("Select Query run");
		List<Sudents> userObj = new ArrayList<Sudents>();
		Sudents user = null;
		while(rs.next())
		{
			user= new Sudents();
		user.setSdu_name(rs.getString(1));
		user.setFather_name(rs.getString(2));
		user.setSdu_class(rs.getString(3));
		user.setPhone(rs.getString(4));
		user.setCity(rs.getString(5));
		user.setState(rs.getString(6));
		user.setCountry(rs.getString(7));
		userObj.add(user);

		}

		ps.close();
		connection.close();

		return userObj;

	}
	public static Connection deleteStudent(Sudents delete) throws ClassNotFoundException, SQLException
	{
		Connection conn =getConnection();
		String insertQuery = "delete from tb_dhanasekaran_sdutent_details where roll_no = ?";
		PreparedStatement ps = conn.prepareStatement(insertQuery);
		ps.setInt(1, delete.setRollno(insertQuery));
	
		ps.executeLargeUpdate();
		ps.close();
		conn.close();
		return conn;
	}
	

}
