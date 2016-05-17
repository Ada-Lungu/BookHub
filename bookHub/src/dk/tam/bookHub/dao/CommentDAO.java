/**
 * 
 */
package dk.tam.bookHub.dao;

import java.util.List;

import dk.tam.bookHub.model.Comments;

/**
 * @author Martyna
 *
 */
public interface CommentDAO {
	public List<Comments> getAllComments();
}
