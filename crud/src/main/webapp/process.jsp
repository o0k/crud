<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

    request.setCharacterEncoding("utf-8");

    String username = request.getParameter("username");
    String pwd = request.getParameter("pwd");
    String[] hobby = request.getParameterValues("hobby");
    String sex = request.getParameter("sex");
    String home = request.getParameter("home");

    if("admin".equals(username) && "000".equals(pwd)){

        session.setAttribute("username", username);
        session.setAttribute("hobby", hobby);
        session.setAttribute("home", home);
        session.setAttribute("sex", sex);
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }
    else{
        response.sendRedirect("login.jsp");
    }
%>