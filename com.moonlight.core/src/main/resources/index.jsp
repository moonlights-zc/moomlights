<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>欢迎登录！</title>
    <link rel="stylesheet" href="../../../../../com.moonlights.core/target/classes/Resource/CSS/index.css">
    <script type="text/javascript">
        //此处应改成异步请求的形式
        var stats;
        stats = "${requestScope.statsMessage}";
        if(stats!="")window.alert(stats);

    </script>
</head>
<body id="body" >
<!--登陆面板====base-->
<div class="base">
    <div class="title">
        <center>欢迎登陆系统</center>
    </div>
    <div class="inputWords">
        <form action="loginUser.do"method="post"class="Input">
            请输入账号： <input class="in" type="text" name="account"><br><br>
            请输入密码： <input class="in" type="password" name="password">
            <input type="submit"value="登录"class="submit">
        </form>
    </div>
</div>
    <a href="#" id="application" style="color:black ">关于本系统</a>
</body>

</html>