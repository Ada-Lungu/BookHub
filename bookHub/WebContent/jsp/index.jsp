<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="javax.print.attribute.standard.DateTimeAtCompleted"%>
<%@page import="dk.tam.bookHub.model.Comments"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/bookstore.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

   <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello here</h1>



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
   
   
   		List<Comments> comments = (List<Comments>)request.getAttribute("commentsList");
        //List<Comments> comments = (List<Comments>)request.getAttribute("commentsList");
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
          }
        
 
  %>
  </tbody>

 </table>













 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
      






</body>
</html>