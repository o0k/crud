<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% request.setCharacterEncoding("utf-8"); %>
用户姓名：<%= session.getAttribute("username")%><br>
用户性别：<%= session.getAttribute("sex")%><br>
用户爱好：<%
    String[] hobby = (String[]) session.getAttribute("hobby");
    for (int i = 0; i < hobby.length; i++)
        out.println(hobby[i] + "  ");
%><br>
用户籍贯：<%= session.getAttribute("home")%><br>