<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        alert("mianshi")
        function test() {
            alert(this);
        }
        test.call(null); // [object window]
    </script>
</head>
<body>
<p>springboot-web</p>
<p>springboot-web</p>
<p>springboot-web</p>
</body>
</html>
