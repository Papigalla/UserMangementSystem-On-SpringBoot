<%@page import="com.example.User_Management_System.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<User> users=(List<User>)request.getAttribute("user");%>
<table>
<thead>
<tr>
<td>userId</td>
<td>username</td>
<td>email</td>
<td>password</td>
<td>Edit</td>
<td>delete</td>
</tr>
</thead>

<tbody>
<% for(User user:users) { %>
<tr>
<td><%= user.getUserId()%></td>
<td><%= user.getUsername()%></td>
<td><%= user.getEmail()%></td>
<td><%=user.getPassword()%></td>
<td><a href="update-user?user_id=<%= user.getUserId() %>">Edit</a>
<td><a href="delete-user?user_id=<%=user.getUserId()%>">Delete</a>
 
</tr>
<%} %>
</tbody>
</table>
</body>
</html>