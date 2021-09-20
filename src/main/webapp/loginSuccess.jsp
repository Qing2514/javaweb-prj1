<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2021/9/18
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="cn.edu.zjut.model.UserBean"%>
<html>
<head>
    <meta http-equiv="content-Type" content="text/html; charset=utf-8">
    <title>登录成功</title>
</head>
<body>
<% UserBean user= (UserBean)(request.getAttribute ("USER")); %>
登录成功，欢迎您!
<%=user.getUsername()%>!
</body>
</html>
