<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-5-4
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jq350.js"></script>
</head>
<body>
<%--下拉菜单,值传往后端--%>
<form action="all/pull" method=get>
    <div>
        <select name="" id="testselect">
            {% for i  in select_box %} 
            <option value="" id="idselect" name="adsense">{{ i.zone_name }}</option>
            {% endfor %}
        </select>
        <input type="hidden" value="" name="adsense" id="adsense"/>
        <input type="search"  value="" id="adsense_ID" name="adsense_ID" placeholder="输入广告位ID"/>
        <input id="query_date"  name="query_date" type="date" value="2016-08-01"/>
        <button type="submit"  id="submit_data">查询</button>
    </div>
</form>
<%--下拉菜单--%>
<select name="grade" id="grade" onchange="change(this.value)">
    <option value="1">班级一</option>
    <option value="2">班级二</option>
    <option value="3">班级三</option>
    <option value="4">班级四</option>
    <option value="5">班级五</option>
</select>
</body>
</html>

<script>
    var x='3';
    var sel = document.getElementById("grade");
    for(var i = 0; i<sel.option.length;i++) {
        if (sel.option[i].value==x) {
            sel.option[i].selected=true;
            break;
        }
    }

    $("#submit_data").click(function(){
        alert("jquery 起作用了")
        //备注：$("#testselect option:selected").text()是为了获取下拉框的值
        $("#adsense").val($("#testselect option:selected").text());
    })

</script>
