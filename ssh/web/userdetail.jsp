
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="user.do?method=update" method="post">
        UserID: ${user.userid}<input type="hidden" name="userid" value="${user.userid}"><br />
        Username: <input type="text" name="username" value="${user.username}" /> <br />
        Password: <input type="text" name="password" value="${user.password}" /> <br />
        <input type="submit" value="ADD">
    </form>
  </body>
</html>
