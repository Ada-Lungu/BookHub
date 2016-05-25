
<%@page import="dk.tam.bookHub.model.Reviews"%>

<%@page import="dk.tam.bookHub.model.Comments"%>

<%@page import="java.util.List"%>

<%@page import="java.util.Iterator"%>

<%@page import="java.util.Date"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>



<body>



<jsp:include page="header.jsp"></jsp:include>

 

 	<% String review_title = request.getAttribute("review_title");%>

<h1><%=review_title%></h1>


<% String review_description = request.getAttribute("review_description");%>

<p><%=review_description%></p>


<% List<Comments> review_comments = request.getAttribute("review_comments");%>

<%-- <% foreach (comment in review_comments){



} %> --%>


   <% %>

 

<jsp:include page="footer.jsp"></jsp:include> 