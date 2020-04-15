<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        alert("结果如下: ");
        var a = document.getElementById("name");
        alert(a);

        var b = document.getElementsByName("name");
        alert(b);

    </script>
</head>
<body>

<input type="text" value="张澎" id="name" name="name">

</body>
</html>
