<%-- 
    Document   : addcourse
    Created on : Jun 3, 2024, 10:06:08 PM
    Author     : trant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <c:if test="${requestScope.er != null}">
        <h1 style="color:red;">${requestScope.er}</h1>
    </c:if>
        
        <form action="add" method="post">
            ID:
            <input type="text" name="id"  /><br>
            Info:
            <input type="text" name="info"  /><br>
            Mentor
            <input type="text" name="mentor" /><br>
            <input type="submit" value="SUBMIT" />
        </form>
    </body>
</html>
