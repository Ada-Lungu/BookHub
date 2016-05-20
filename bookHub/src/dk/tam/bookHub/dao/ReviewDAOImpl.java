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

import dk.tam.bookHub.model.Reviews;

/**
 * @author Martyna
 *
 */
public class ReviewDAOImpl extends DbConnectionDAO implements ReviewDAO{
	
	
	public List<Reviews> getAllReviews() {
		
		
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
			   reviews.setReview_title(resultSet.getString("review_title"));
			   reviews.setBook_title(resultSet.getString("book_title"));
			   reviews.setBook_author(resultSet.getString("book_author"));
			   reviews.setBook_publisher(resultSet.getString("book_publisher"));
			   reviews.setBook_picture(resultSet.getBlob("book_picture"));
			   reviews.setReview_content(resultSet.getString("review_content"));
			   reviews.setReview_date(resultSet.getTimestamp("review_date"));
			   reviewList.add(reviews);		    
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
