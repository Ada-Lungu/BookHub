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
public class CommentDAOImpl extends DbConnectionDAO {
public List<Comments> displayAllComments() {
		
		List<Comments> commentsList = new ArrayList<Comments>();
		

		  String sql = "select * from comments";

		  Connection connection = null;
		  try {
		   connection = getConnection();
		   PreparedStatement statement = connection.prepareStatement(sql);
		   ResultSet resultSet = statement.executeQuery();
		   while (resultSet.next()) {
			   Comments comments = new Comments();
			   comments.setId(resultSet.getLong("id"));
			   comments.setNickname(resultSet.getString("nickname"));
			   comments.setPosted_date(resultSet.getDate("posted_date"));
			   comments.setReview_id(resultSet.getLong("review_id"));
			   comments.setContent(resultSet.getString("content"));
			   
			   commentsList.add(comments);

		    
		   }
		  } catch (SQLException ex) {
		   ex.printStackTrace();
		  } finally {
		   closeConnection(connection);
		  }
		  return commentsList;
		 }

	/**
	 * 
	 */
	public CommentDAOImpl() {
		// TODO Auto-generated constructor stub
	}

}
