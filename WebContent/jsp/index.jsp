<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.Blob"%>
<%@page import="dk.tam.bookHub.model.Reviews"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Date"%>
<%@page import="dk.tam.bookHub.model.Comments"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<body>
<%
	String urlPrefix = application.getInitParameter("urlPrefix");
%>
<jsp:include page="header.jsp"></jsp:include> 

<h1>INDEX page</h1>
<h1>Reviews</h1>
 <table id="reviews">
  <thead>
   <tr>
    <th>Review Title</th>
    <th>Book title</th>
    <th>Book author</th>
    <th>Book publisher</th>
    <th>Book picture</th>
    <th>Review content</th>
    <th>Review date</th>
    
   </tr>
  </thead>
  <tbody>
   <%
   		List<Reviews> reviews = (List<Reviews>)application.getAttribute("reviewList");
   		if(reviews == null){ %><h1>No reviews</h1><%}else{
        Iterator<Reviews> iterator = reviews.iterator();

        while (iterator.hasNext()) {
        	Reviews review = (Reviews)iterator.next();
        	String reviewTitle = review.getReview_title();
        	String bookTitle = review.getBook_title();
        	String bookAuthor = review.getBook_author();
        	String bookPublisher = review.getBook_publisher();
        	Blob bookPicture = review.getBook_picture();
        	String reviewContetnt = review.getReview_content();
        	Timestamp reviewDate = review.getReview_date();

  %>
   <tr>
   <td><%= reviewTitle%></td>
    <td><%= bookTitle%></td>
    <td><%= bookAuthor%></td>
    <td><%= bookPublisher%></td>
    <td><%= bookPicture%></td>
    <td><%= reviewContetnt%></td>
    <td><%= reviewDate%></td>

   </tr>
   <% }}  %>
  </tbody>
 </table> 
 
<h1>File Upload</h1>
 <form method="post" action="<%=urlPrefix%>?action=uploadImage"
     enctype="multipart/form-data">
     Select file to upload: <input type="file" name="file" size="60" /><br />
     <br /> <input type="submit" value="Upload" />
 </form>
 
<% String message = request.getParameter("message"); 
 if(message == null){ %><h1>No message at all</h1><%}else{
  %><%= message%><%
 }
 %>

 
 
 
<jsp:include page="addAcomment.jsp"></jsp:include> 
 
<jsp:include page="footer.jsp"></jsp:include> 