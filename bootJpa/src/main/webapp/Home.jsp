<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
 <form action="addemp" method="post">
  Employee ID :  <input type="text" name="eid"/><br/>
  Name		  :     <input type="text" name="ename"/><br/>
  Technology: <input type="text" name="tech"/>
  <br/>
  <input type="submit"/><br>
  </form>
  
  <form action="getemp" method="post">
  Employee ID :  <input type="text" name="eid"/><br/>
  <br/>
  <input type="submit"/><br>
  </form>
</body>
</html>