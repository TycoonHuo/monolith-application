<%--
  Created by IntelliJ IDEA.
  User: huoguangyao
  Date: 2019/3/11
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <form action="/api/v1/login" method="post">
        <input type="text" name="loginId">
        <input type="password" name="loginPwd" >
        <input type="submit" value="submit">
    </form>
</body>
</html>
