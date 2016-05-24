<%@page import="dk.tam.bookHub.model.Reviews"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<body>
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

  %>
   <tr>
   <td><%= reviewTitle%></td>
    <td><%= bookTitle%></td>

   </tr>
   <% }}  %>
  </tbody>
 </table> 
<jsp:include page="footer.jsp"></jsp:include> 