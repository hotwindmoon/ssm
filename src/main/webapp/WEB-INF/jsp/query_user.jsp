<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2019/11/14
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>User</title>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
    <script>
        $(document).ready(function() {
            $("#btn").click(function() {
                $.get("/ssm/user/showUser?id=1", function(data, status) {
                    $("#username").text(data);
                    $("#username").text(JSON.parse(data).username);
                });
            });
        });
    </script>
</head>

<body>
<button id="btn" type="button">获取用户名</button><br />
<p id="username"></p>
${user.username}
</body>
</html>
