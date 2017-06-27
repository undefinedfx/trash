<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
    <form action="findByAny">
        <input type="text" name="value" /> <input type="submit" value="Find" />
    </form>

    <c:if test="${not empty emps}">
        <table>
            <tr>
                <td>Empid</td>
                <td>Ename</td>
                <td>Hiredate</td>
                <td>Photoname</td>
                <td>Photo</td>
                <td>Operate</td>
            </tr>
            <c:forEach items="${emps}" var="e">
                <tr>
                    <td>${e.empid}</td>
                    <td>${e.ename}</td>
                    <td>${e.hiredate}</td>
                    <td><img src="images/${e.photo}"/></td>
                    <td><img src="findPhotoByEmpid?empid=${empid}"/></td>
                    <td>
                        <a href="findByEmpid?empid=${e.empid}">Detail</a>&nbsp;&nbsp;
                        <a href="delete?empid=${e.empid}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <a href="empnew.jsp">Create new one</a>
</body>
</html>
