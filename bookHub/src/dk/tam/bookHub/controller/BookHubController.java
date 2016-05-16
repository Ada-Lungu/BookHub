/**
 * 
 */
package dk.tam.bookHub.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dk.tam.bookHub.dao.CommentDAO;
import dk.tam.bookHub.dao.CommentDAOImpl;
import dk.tam.bookHub.model.Comments;

/**
 * @author Martyna
 *
 */
public class BookHubController extends HttpServlet {

	/**
	 * 
	 */
	public BookHubController() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void init(ServletConfig config) throws ServletException {
		  super.init(config);
		  
		  CommentDAO commentDAO = new CommentDAOImpl();
		  
		  
		  
		  // calling DAO method to retrieve commentList from Database
		  List<Comments> commentList = commentDAO.displayAllComments();
		  
		  ServletContext context = config.getServletContext();
		  context.setAttribute("commentList", commentList);

		 }

		 protected void doGet(HttpServletRequest request,
		   HttpServletResponse response) throws ServletException, IOException {
		   doPost(request, response); 
		 }

}
