<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>toBack.jsp</title>
</head>
<body>
<!-- 普通form -->
<h4>1.helloworld2</h4>
<hr>
<input type="button" value="提交" οnClick="window.location.href='ajax.jsp';"/><br>
<a href="${pageContext.request.contextPath}/WEB-INF/view/ajax.jsp">go to ajax.jsp</a>
<input type="button" onclick="mm()" value="跳转">
<script>
    function mm() {
        alert("马上跳转！！！")

        alert("跳转完成！！！")
    }
</script>
<hr>
<form action="helloworld2">
    用户名：<input name="userName" />
    密  码：<input name="pass" />
            <input type="submit" value="登陆">
</form>
<br>
<h4>2.anno/testRequestBoby</h4>
<form action="anno/testRequestBody" method="get">
    用户姓名:<input type="text" name="username"><br>
    用户年龄:<input type="text" name="age"><br>
             <input type="submit" value="提交">
</form>
<br>
<h4>3.anno/testRequestParam</h4>
<form action="anno/testRequestParam2" method="get">
    用户姓名: <input type="text" name="username"><br>
    用户年龄: <input type="text" name="age"><br>
              <input type="submit" value="提交">
</form>
<form action="ajax.jsp">
    <input type="submit" value="测试-提交到ajax.jsp">
</form>
</body>
</html>
