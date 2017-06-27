<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Emp New</title>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript" src="js/layer/layer.js"></script>
</head>
<body>
    <form id="form" action="save" method="post" enctype="multipart/form-data">
        Empid: ${e.empid} <input type="hidden" name="empid" value="${e.empid}">
        Ename: <input type="text" name="ename" value="${e.ename}"/> <br />
        Hiredate: <input type="date" name="hiredate" value="${e.hiredate}" /> <br />
        photo: <input type="file" name="file" /> <img src="images/${e.photo}" /><br />
        <input type="submit" value="SAVE" />
    </form>
</body>
</html>
