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
import dk.tam.bookHub.model.Reviews;

/**
 * @author Martyna
 *
 */
public class ReviewDAOImpl extends DbConnectionDAO implements ReviewDAO{
	
	
	public List<Reviews> displayAllReviews() {
		
		
		List<Reviews> reviewList = new ArrayList<Reviews>();
		

		  String sql = "select * from reviews";

		  Connection connection = null;
		  try {
		   connection = getConnection();
		   PreparedStatement statement = connection.prepareStatement(sql);
		   ResultSet resultSet = statement.executeQuery();
		   while (resultSet.next()) {
			   Reviews reviews = new Reviews();
			   reviews.setId(resultSet.getLong("id"));
			   reviews.setBook_author(resultSet.getString("book_author"));
			   
//			   Comments comments = new Comments();
//			   comments.setId(resultSet.getLong("id"));
//			   comments.setNickname(resultSet.getString("nickname"));
//			   comments.setPosted_date(resultSet.getDate("posted_date"));
//			   comments.setReview_id(resultSet.getLong("review_id"));
//			   comments.setContent(resultSet.getString("content"));
//			   
//			   commentsList.add(comments);

		    
		   }
		  } catch (SQLException ex) {
		   ex.printStackTrace();
		  } finally {
		   closeConnection(connection);
		  }
		  return reviewList;
		 }

	/**
	 * 
	 */
	public ReviewDAOImpl() {
		// TODO Auto-generated constructor stub
	}

}
