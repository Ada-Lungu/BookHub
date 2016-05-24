<%@page import="dk.tam.bookHub.model.Reviews"%>
<%@page import="dk.tam.bookHub.model.Comments"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<body>
<jsp:include page="header.jsp"></jsp:include> 
<h1>Hello here</h1>

<table id="comments">
  <thead>
   <tr>
    <th id="th-title">Nickname</th>
    <th id="th-author">Content</th>
    <th id="th-delete">Date</th>
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
        	String commentContent = comment.getContent();
        	String commentAuthor = comment.getNickname();
        	Date commentDate = comment.getPosted_date();
  %>
   <tr>
   <td><%= commentAuthor%></td>
    <td><%= commentContent%></td>
    <td><%= commentDate%></td>
   </tr>
   <% }}  %>
  </tbody>
 </table> 
<jsp:include page="footer.jsp"></jsp:include> 
