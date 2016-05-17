<%@page language="java" contentType="text/html"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Hashtable"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="dk.tam.bookHub.model.Comments"%>

<%
	String urlPrefix = application.getInitParameter("urlPrefix");
%>

<nav class="navbar navbar-default">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="<%=urlPrefix%>">Home</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        
        <li><a class="link1" href="<%=urlPrefix%>?action=allComments"><span
					 >All Comments</span></a></li>
        <%-- <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">All Categories<span class="caret"></span></a>
          <ul class="dropdown-menu">
          <% 
          			List<Category> categoryList1 = (List<Category>) application.getAttribute("categoryList");
					Iterator<Category> iterator1 = categoryList1.iterator();
					while (iterator1.hasNext()) {
						Category category1 = (Category) iterator1.next();
				%>
            <li><a class="label"
					href="<%=param1%>?action=category&categoryId=<%=category1.getId()%>&category=<%=category1.getCategoryDescription()%>"><span
						><%=category1.getCategoryDescription()%></span></a></li>
						<li role="separator" class="divider"></li>
           <%
					}
				%>

          </ul>
        </li>
        <li><a class="link1" href="<%=param1%>?action=contact">Contact</a></li> --%>
      </ul>
<!--       <form class="navbar-form navbar-right search" role="search">
        <div class="form-group">
        <span class="tooltip_message">?</span>
        	<input type="hidden" name="action" value="search" /> 
        	<input id="text" class="" type="text" name="keyWord" size="12" /> 
		<p/>
        </div>
        	
        <button id="submit" type="submit" class="btn btn-success">Search</button>
      </form> -->
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>











