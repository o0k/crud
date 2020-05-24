xx:
jdbc:mysql://localhost:3306/mybatis?useSSL=false&serverTimezone=Hongkong&characterEncoding=utf-8&autoReconnect=true
JSTL 表达式
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

// 如下两个都可以:
<script type="text/javascript" src="/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>