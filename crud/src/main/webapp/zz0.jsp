<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        alert("any");
        function b(x,y,a) {
            arguments[2] = 10;
            alert(arguments[0]);
            alert(arguments[1]);
            alert(arguments.callee)
            console.log("log")
            alert(a);
        }
        b(1,2,3);



        function test() {
            var s = "";
            for (var i = 0; i < arguments.length; i++) {
                alert(arguments[i]);
                s += arguments[i] + ",";
            }
            return s;
        }
        test("name", "age");

    </script>
</head>
<body>
<p>springboot-web</p>
<p>springboot-web</p>
<p>springboot-web</p>
</body>
</html>
