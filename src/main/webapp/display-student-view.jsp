<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="com.jsp.spring_mvc.studentdb.entity.Student" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Student> sList= (List)request.getAttribute("studentList");
%>

<table border="">

<tr>
<th>Student-ID</th>
<th>Student-NAME</th>
<th>Student-COURSE</th>
<th>Student-AGE</th>
<th>Student-EMAIL</th>
<th>UPDATE</th>
<th>DELETE</th>
</tr>

<% for(Student student:sList){ %>
<tr>
<th><%=student.getStudentId() %></th>
<th><%=student.getStudentName() %></th>
<th><%=student.getStudentCourse() %></th>
<th><%=student.getStudentAge() %></th>
<th><%=student.getStudentEmail() %></th>

<th><a href="find-student-by-id?studentId=<%=student.getStudentId()%>">Update</a></th>
<th>DELETE</th>
</tr>
<%} %>

</table>

</body>
</html>