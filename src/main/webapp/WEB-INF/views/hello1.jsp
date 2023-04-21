<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>hello1 입니당</h2>
<a href="/">index로 가기</a>

<%--action 보낼 목적지 / method 방법 --%>

<form action="/form-param1" method="get">
    <input type="text" name="p1"> <br>
    <input type="text" name="p2"> <br>
    <input type="submit" value="전송">
<%--    name 이름이 파라미터 그대로 정해진다 --%>
</form>

<form action="/form-param2" method="post">
    <input type="text" name="p3"> <br>
    <input type="text" name="p4"> <br>
    <input type="submit" value="전송">
</form>

</body>
</html>
