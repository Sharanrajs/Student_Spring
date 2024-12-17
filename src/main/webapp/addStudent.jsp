<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<h1>Enter the student Details</h1>
<form action="add-student" method="post">
<input type="number" placeholder="Enter the id" name="studentId">
<input type="text" placeholder="Enter the name" name="studentName">
<input type="text" placeholder="Enter the course" name="studentCourse">
<input type="text" placeholder="Enter the email" name="studentEmail">
<input type="number" placeholder="Enter the Age" name="studentAge">
<input type="submit" value="ADD">
</form>


</body>
</html>