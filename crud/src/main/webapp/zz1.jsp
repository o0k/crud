<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        alert("mianshi")
        function test() {
            var s = "";
            for (var i = 0; i < arguments.length; i++) {
                alert(arguments[i]);
                s += arguments[i] + ",";
            }
            return s;
        }
        var v = test("name", "age");
        alert("v = " + v);
    </script>
</head>
<body>
<p>springboot-web</p>
<p>springboot-web</p>
<p>springboot-web</p>
</body>
</html>
