/**
 * 
 */
package dk.tam.bookHub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Martyna
 *
 */
public class DbConnectionDAO {
	
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "";
	
	 static {
	  try {
	   Class.forName("com.mysql.jdbc.Driver");
	  } catch (ClassNotFoundException ex) {
	  }
	 }

	 protected void closeConnection(Connection connection) {
	  if (connection == null)
	   return;
	  try {
	   connection.close();
	  } catch (SQLException ex) {
	  }
	 }
	 
	 protected Connection getConnection() throws SQLException {
	  return DriverManager.getConnection("jdbc:mysql://localhost:3306/book_hub",
	    DB_USERNAME, DB_PASSWORD);
	 }
	/**
	 * 
	 */
	public DbConnectionDAO() {
		// TODO Auto-generated constructor stub
		
	}

}
