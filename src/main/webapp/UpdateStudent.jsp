<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.spring_mvc.studentdb.entity.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%Student student= (Student) request.getAttribute("Students");%>


<form action="update-insert" method="post">
<input type="number" value=<%=student.getStudentId() %> name="studentId">
<input type="text" value=<%=student.getStudentName()%> name="studentName">
<input type="text" value=<%=student.getStudentAge()%> name="studentName">
<input type="text" value=<%=student.getStudentCourse()%> name="studentName">
<input type="text" value=<%=student.getStudentEmail()%> name="studentName">
<input type="submit" value="Update">
</form>

</body>
</html>