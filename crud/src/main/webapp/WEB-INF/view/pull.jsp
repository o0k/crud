<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-5-4
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JQuery</title>
    <script type="text/javascript" src="/js/jquery-3.4.1.js"></script>

    <script  type="text/javascript">
        $(document).ready(function(){
            alert("abc");
            $("p").click(function(){
                $(this).hide();
            });
        });
    </script>
</head>
<body>

<h2>PULL</h2>
<p>如果你点我我就会消失</p>
<p>继续点我！</p>
<p>接着点我！！</p>

</body>
</html>
