<%@page import="dk.tam.bookHub.dao.LoginValidate"%>
<%@page import="dk.tam.bookHub.controller.BookHubController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 
 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Please Login....</title>

<script type="text/javascript">
    function validate_required(field, alerttxt) {
        with (field) {
            if (value == null || value == "") {
                alert(alerttxt);
                return false;
            }
            else {
                return true;
            }
        }
    }

    function validate_Loginform(thisform) {
        with (thisform) {
            if (validate_required(username, "Please enter the username") == false)
            {
                username.focus();
                return false;
            }

            if (validate_required(password, "Please enter the password") == false)
            {
                password.focus();
                return false;
            }
            return true;
        }
    }
</script>
</head>
<body>
<%
	String urlPrefix = application.getInitParameter("urlPrefix");
%>



 <form action="<%=urlPrefix%>?action=adminLogin" method="post" onsubmit="return validate_Loginform(this)">
  Email: <input name="email" size="20" value=""  type="text">
    Password: <input name="password" size="20" value=""  type="password">
    <input value="Login"  type="submit"></td>
   
  <br>
  <br>
  <br>
  <br>
  
  <p align="center"> <b><font color="darkred"></font></b></p>

 </form>
</body>
</html>
