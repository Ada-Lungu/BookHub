/**
 * 
 */
package dk.tam.bookHub.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
//@ WebServlet ("/BookHubServlet")
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
		  List<Comments> commentList = commentDAO.getAllComments();
		  System.out.println(commentList.toString());
			ServletContext context = config.getServletContext();
			context.setAttribute("commentList", commentList);

		 }
	
	
	

		 protected void doGet(HttpServletRequest request,
		   HttpServletResponse response) throws ServletException, IOException {
		   doPost(request, response); 
		 }
		 /**
			 * @param request Request contains the action we want to run, and the parameters to do so.
			 * @param response Response is used to contain the output of the request
			 */
			protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
				String base = "/jsp/";
				String url = base + "comments.jsp";
				String action = request.getParameter("action");
				//String category = request.getParameter("category");
				//String keyWord = request.getParameter("keyWord");
				if (action != null) {
					switch (action) {
					case "allComments":
						getAllComments(request, response);
						url = base + "comments.jsp";
						break;
//					case "category":
//						findAllBooks(request, response);
//						url = base + "category.jsp?category=" + category;
//						break;
//					case "search":
//						searchBooks(request, response, keyWord);
//						url = base + "searchResult.jsp";
//						break;
//					case "contact":
//						url = base + "contact.jsp";
//						break;
//					case "createBook":
//						createBook(request, response);
//						break;
//					case "deleteBook":
//						deleteBook(request, response);
//						break;
					}
				}
				RequestDispatcher requestDispatcher = getServletContext()
						.getRequestDispatcher(url);
				requestDispatcher.forward(request, response);
			}
			
			
			private void getAllComments(HttpServletRequest request,
					HttpServletResponse response) throws ServletException, IOException {
				try {
					CommentDAO commentDAO = new CommentDAOImpl();
					List<Comments> commentList = commentDAO.getAllComments();
					
					request.setAttribute("commentList", commentList);

				} catch (Exception e) {
					System.out.println(e);
				}
			}


}
