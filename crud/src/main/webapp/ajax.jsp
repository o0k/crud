<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-05-24
  Time: 1:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AJAX</title>
    <script>
        function fun() {
            // 1.创建核心对象
            var xmlhttp;
            if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
                xmlhttp = new XMLHttpRequest();
            } else {// code for IE6, IE5
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            // 2.建立连接
            xmlhttp.open("GET", "ajaxServlet?username=tom", true);
            // 3.发送请求
            xmlhttp.send();
            xmlhttp.onreadystatechange = function () {
                if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                    var responseText = xmlhttp.responseText;
                    alert(responseText);
                }
            }
        }
    </script>
</head>
<body>
<h2>WEB-INF 外面的</h2>
<input type="button" value="发送异步请求" onclick="fun();">
<input>
</body>
</html>
