<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        alert("结果如下: ");


    </script>
</head>
<body>
<input type="text" >

<form action="process.jsp" method="post">
    用户名：<input name="username" value="" /><br>
    用户密码：<input name="pwd" value="" /><br>
    用户性别：<input type="radio" name="sex" value="男">男
    <input type="radio" name="sex" value="女">女<br>
    用户爱好：<input type="checkbox" name="hobby" value="游泳">游泳
    <input type="checkbox" name="hobby" value="看书">看书
    <input type="checkbox" name="hobby" value="看电影">看电影
    <input type="checkbox" name="hobby" value="写代码">写代码<br>
    用户籍贯：<select name="home">
    <option value="广州">广州</option>
    <option value="重庆">重庆</option>
    <option value="上海">上海</option>
</select>
    <br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>

</body>
</html>
