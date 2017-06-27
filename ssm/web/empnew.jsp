<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Emp New</title>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript" src="js/layer/layer.js"></script>
    <script type="text/javascript">
        $().ready(function() {
            $("#form").validate({
                rules: {
                    ename: {
                        required: true,
                        minlength: 5
                    }
                },
                messages: {
                    ename: "必填，最小长度5"
                }
            })
        })
        function f() {
            $.getJSON('/ssm/hello', function(data) {
                alert(data.ename + ":" + data.photo)
                $("#aa").val(data.ename)
            })
        }
    </script>
</head>
<body>
    <input type="button" value="click" onclick="f()" /><div id="aa">123</div>
    <form id="form" action="add" method="post" enctype="multipart/form-data">
        Ename: <input type="text" name="ename" /> <br />
        Hiredate: <input type="date" name="hiredate" /> <br />
        photo: <input type="file" name="file" /> <br />
        <input type="submit" value="ADD" />
    </form>
</body>
</html>
