<%-- 
    Document   : index
    Created on : Jun 3, 2024, 10:04:59 PM
    Author     : trant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function confirmDelete(courseId) {
                if (confirm("Are you sure you want to delete this student ?")) {
                    window.location.href = "delete?id=" + courseId;
                }
            }
        </script>
    </head>
    <body>
        <a href="addcourse.jsp">ADD COURSE</a>
        <table border="1">
            <thead>
                <tr>
                    <th>CourseID</th>
                    <th>Info</th>
                    <th>Mentor</th>
                    <th colspan="2">Action</th>
                </tr>
            </thead>
            <c:forEach items="${requestScope.data}" var="c">
                <tbody>
                    <tr>
                        <td>${c.courseId}</td>
                        <td>${c.info}</td>
                        <td>${c.mentor}</td>
                        <td><a href="edit?id=${c.courseId}">Edit</a></td>
                        <td><a href="javascript:void(0)" onclick="confirmDelete('${c.courseId}')">Delete</a></td>
                    </tr>
                </tbody>            
            </c:forEach>
        </table>
    </body>
</html>
