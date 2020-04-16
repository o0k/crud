<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserAdd</title>
</head>

<body>

<form action="user/list" method="post">
    <input type="submit" value="提交">
</form>

<div class="username">
    <span>昵称：</span>
    <input type="text" name="username" placeholder="${user.username }"/>
</div>


</body>
</html>
