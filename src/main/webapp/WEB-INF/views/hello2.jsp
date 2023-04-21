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
<h2>hello2 입니당</h2>
<button onclick="param1()">파라미터 전송</button>
</body>
<script>
    const param1 = () => {
   // location.href =  "/hello-param1?name=나나핑&age=3";
    const name = "나나핑";
    const age = 3;
    location.href = "/hello-param1?name=" +name+ "&age=" +age;

    }
</script>
</html>
