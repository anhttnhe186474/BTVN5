<%-- 
    Document   : editcourse
    Created on : Jun 3, 2024, 11:11:04 PM
    Author     : trant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="edit" method="post">
            <input type="hidden" name="id" value="${course.courseId}">
            Info:<input type="text" name="info" value="${course.info}" /><br>
            Mentor:<input type="text" name="mentor" value="${course.mentor}"/><br>
            <input type="submit" value="EDIT"/>
        </form>
    </body>
</html>
