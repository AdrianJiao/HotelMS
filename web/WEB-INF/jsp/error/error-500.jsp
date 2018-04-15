<%--
  Created by IntelliJ IDEA.
  User: Adrian
  Date: 2018/4/11
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
    <link href="${pageContext.request.contextPath}/css/erropage.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div class="wrap">
    <div class="header">
        <div class="logo">
            <h1><a href="#">MyGod</a></h1>
        </div>
    </div>
    <div class="content">
        <img src="${pageContext.request.contextPath}/img/error500-img.png" title="error" />
        <c:if test="${!empty errormsg}">
            <p><span><label>O</label>hh.....</span>哎啊，发生错误啦！${errormsg}</p>
        </c:if>
        <a href="#">Back To Home</a>
    </div>
</div>
</body>
</html>