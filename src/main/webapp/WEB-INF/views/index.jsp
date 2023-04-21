<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/hello1">hello1으로 가자</a>

<button onclick="hello2()">hello2로 가자</button>

<a href="hello3">hello3 출력</a>
<a href="hello4">hello4 출력</a>
<a href="hello5">hello5 출력</a>


</body>
<script>
    const hello2 = () => {
        location.href="/hello2";
    }

</script>
</html>
