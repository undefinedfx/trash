
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="user_update.action">
        UserID: ${user.userid}<input type="hidden" name="user.userid" value="${user.userid}"><br />
        Username: <input type="text" name="user.username" value="${user.username}" /> <br />
        Password: <input type="text" name="user.password" value="${user.password}" /> <br />
        <input type="submit" value="ADD">
    </form>
  </body>
</html>
