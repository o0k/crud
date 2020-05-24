<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>success.jsp</title>
</head>
<body>

<h1>登录成功</h1>
用户名username：${user.username}

<h3>传统的取值方式</h3>
用户名：<%=request.getAttribute("account")%>
<br>
密码：<%=request.getAttribute("pwd")%>


<h3>EL表达式取值</h3>

<%--使用EL表达式取值--%>
用户名：${requestScope.account}
<br>
<br>
用户名: ${user.username}<br>
密  码: ${pwd}
</body>
</html>
