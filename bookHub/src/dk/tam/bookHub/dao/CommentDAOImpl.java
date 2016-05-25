/**
 * 
 */
package dk.tam.bookHub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dk.tam.bookHub.model.Comments;

/**
 * @author Martyna
 *
 */
public class CommentDAOImpl extends DbConnectionDAO implements CommentDAO {
	
	Connection connection = null;

	public List<Comments> getAllComments() {
		
		List<Comments> commentsList = new ArrayList<Comments>();

		  String sql = "select * from comments";
		  int i = 0; 
		  try {
		   connection = getConnection();
		   PreparedStatement statement = connection.prepareStatement(sql);
		   System.out.println(statement.toString());
		   ResultSet resultSet = statement.executeQuery();
		   System.out.println(resultSet.toString());
		   while (resultSet.next()) {
			   Comments comments = new Comments();
			   comments.setId(resultSet.getLong("id"));
			   comments.setNickname(resultSet.getString("nickname"));
			   comments.setPosted_date(resultSet.getTimestamp("posted_date"));
			   comments.setReview_id(resultSet.getLong("review_id"));
			   comments.setContent(resultSet.getString("content"));
			   commentsList.add(comments);
			   i++;
		   }
		  } catch (SQLException ex) {
		   ex.printStackTrace();
		  } finally {
		   closeConnection(connection);
		   System.out.println("i=" +i);
		  }
		  return commentsList;
		 }
	
	
	public void submitComment(String user_name, String comment) {
		
		String sql = "INSERT INTO comments (nickname, content) VALUES(user_name, comment)";
		  try {
			   connection = getConnection();
			   PreparedStatement statement = connection.prepareStatement(sql);
			   System.out.println(statement.toString());
			   ResultSet resultSet = statement.executeQuery();
			   System.out.println("comment inserted into DB");
			   
			  } catch (SQLException ex) {
			   ex.printStackTrace();
			   System.out.println("comment failed to be inserted into DB");
			  } finally {
			   closeConnection(connection);
			   System.out.println();
			  }
//			  return "";
	 }
		
		

	

	/**
	 * 
	 */
	public CommentDAOImpl() {
		// TODO Auto-generated constructor stub
	}

}
