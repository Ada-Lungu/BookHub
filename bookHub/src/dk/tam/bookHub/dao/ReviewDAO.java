/**
 * 
 */
package dk.tam.bookHub.dao;

import java.util.List;

import dk.tam.bookHub.model.Reviews;

/**
 * @author Martyna
 *
 */
public interface ReviewDAO {
	
		public List<Reviews> getAllReviews();
		
		public List<Reviews> getReviewWithID(Long id);
		
}
