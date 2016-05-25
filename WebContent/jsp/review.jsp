
<%@page import="dk.tam.bookHub.model.Reviews"%>
<%@page import="dk.tam.bookHub.model.Comments"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<body>

<jsp:include page="header.jsp"></jsp:include>

<%
	String urlPrefix = application.getInitParameter("urlPrefix");
%>


	<% Review review = request.getAttribute("reviewData");%>	

	
 	<% String review_title = request.getAttribute("review_title");%>
	<h1><%=review_title%></h1>

	<% String review_description = request.getAttribute("review_description");%>
	<p><%=review_description%></p>
	
	<jsp:include page="comments.jsp"></jsp:include>
	
	 <form method="post" action="<%=urlPrefix%>?action=submitComment">	
	     <input type="text" name="name"></br>
	     <textarea rows="4" cols="50" name="comment" form="usrform">
			Enter text here...</textarea>
	     <br /> <input type="submit" value="Comment" />
	 </form>
	 
	 <!-- Display the last submitted comment with getAttributes from servlet or it will be taken with the other comments?-->
	 
	<% String last_comment = request.getAttribute("last_comment");%>
	<% String name_last_comment = request.getAttribute("name_last_comment");%> 
	

   <% %>
 

<jsp:include page="footer.jsp"></jsp:include> 