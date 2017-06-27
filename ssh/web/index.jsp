
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="user.do?method=findByName" method="post">
      <input type="text" name="username" /><input type="submit" value="Find" />
    </form>
    <c:if test="${not empty users}">
        <table>
            <tr>
                <td>userid</td>
                <td>username</td>
                <td>password</td>
                <td>operate</td>
            </tr>
            <c:forEach items="${users}" var="u">
                <tr>
                    <td>${u.userid}</td>
                    <td>${u.username}</td>
                    <td>${u.password}</td>
                    <td>
                        <a href="user.do?method=findByUserid&userid=${u.userid}">Detail</a>
                        <a href="user.do?method=delete&userid=${u.userid}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
  </body>
</html>
