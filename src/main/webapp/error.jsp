<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String errorMessage=(String)request.getAttribute("errorMessage"); %>
<%String url=(String)request.getAttribute("redirectTo"); %>
<h1><%=errorMessage %></h1>
<a href="<%=url %>">Go Back</a>

</body>
</html>