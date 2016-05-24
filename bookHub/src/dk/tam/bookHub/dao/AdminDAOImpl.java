/**
 * 
 */
package dk.tam.bookHub.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

/**
 * @author Martyna
 *
 */
public class AdminDAOImpl extends DbConnectionDAO implements AdminDAO {
	
	public boolean validateUserLogin(String email, String pwd){
		  boolean isAdmin = false;
		  Connection con = null;
		  try{
		   con = getConnection();
		   if(con != null){
		    Statement stat = (Statement) con.createStatement();
		    String qry = "SELECT * FROM users WHERE email = '"+email+"' AND password = '"+pwd+"' ";
		    ResultSet rs = stat.executeQuery(qry);
		    if(rs.next()){
		    	isAdmin = true;
		    }
		   }
		  }catch (Exception e) {
		   e.printStackTrace();
		  }finally{
		   if(con != null){
		    try {
		     con.close();
		    } catch (SQLException e) {
		     e.printStackTrace();
		    }
		   }
		  }
		  return isAdmin;
		 }
		 

	

}
