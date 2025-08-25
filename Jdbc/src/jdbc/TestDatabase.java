package jdbc;

import java.sql.*;

import java.util.Scanner;

//import java.sql.DriverManager;
//import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class TestDatabase {
	
	public static void main(String[] args) throws SQLException{
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());
		
		String url = "jdbc:oracle:thin:@10.33.53.38:1521:xe";
		
		Connection con=DriverManager.getConnection(url,"aryan","17022003");
		System.out.println("connected");
		
		/*
		String queri ="delete from customer where id=?";
		PreparedStatement  st=con.prepareStatement(queri);
	    st.setInt(1,101);
	    
	    System.out.println("deleted rows: "+st.executeUpdate());
		st.setInt(1, 101);
		st.setString(2, "sutherland");
		System.out.println("inserted"+st.executeUpdate());
		
	    String updat="update customer set name =? where id=?";
		PreparedStatement pst = con.prepareStatement(updat);

	    pst.setString(1,"subashu");
	    pst.setInt(2,10);
	    
	    */
	    
	
	   String abc="update customer set name=? where id=?";
	   PreparedStatement at=con.prepareStatement(abc);
	   at.setString(1, "aryan");
	   at.setInt(2, 12);
	   at.execute();
	   
	   
	   String qry ="select * from customer";
	   PreparedStatement pst = con.prepareStatement(qry);
	   ResultSet rs =pst.executeQuery();
	   while(rs.next()){
		   System.out.println(rs.getString("id")+" "+rs.getString("Name"));
	   }
	  
	   
	   
	   
	   
		
	
	}

}
