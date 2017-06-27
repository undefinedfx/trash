
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="user_findByAny.action">
      <input type="text" name="value" /><input type="submit" value="Find" />
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
                        <a href="user_findByUserid.action?user.userid=${u.userid}">Detail</a>
                        <a href="user_delete.action?user.userid=${u.userid}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
  </body>
</html>
