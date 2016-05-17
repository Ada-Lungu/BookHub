<%@page import="java.util.Iterator"%>
<%@page import="java.util.Date"%>
<%@page import="dk.tam.bookHub.model.Comments"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include> 

<h1>INDEX page</h1>
<table id="grid">
  <thead>
   <tr>
    <th id="th-title">Book Title</th>
    <th id="th-author">Author</th>
    <th id="th-delete">Delete</th>
   </tr>
  </thead>


  <tbody>
   <%
   		//ServletContext sc = request.getServletContext();
     		//sc.getAttribute("commentList");
   		List<Comments> comments = (List<Comments>)request.getAttribute("commentList");
   		if(comments == null){ %><h1>No comments</h1><%}else{
        //List<Comments> comments = (List<Comments>)request.getAttribute("commentList");
        Iterator<Comments> iterator = comments.iterator();

        while (iterator.hasNext()) {
        	Comments comment = (Comments)iterator.next();
        	Long commentId = comment.getId();
        	String commentContent = comment.getContent();
        	String commentAuthor = comment.getNickname();
        	Date commentDate = comment.getPosted_date();
        	
        	
        
        
  %>
   <tr>
    <th ><%= comment.getNickname()   %></th>

   </tr>

   <%
          }}
        
 
  %>
  </tbody>

 </table> 
</body>
</html>