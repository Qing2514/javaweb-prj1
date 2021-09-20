<%@ page language="java" contentType="text/html; charset=GBK"
         pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <title>用户注册页面</title>
</head>
<body>

<form action="RegisterController" method="post" onSubmit="return check()">

    <table>
        <tr><td>请输入用戸名:</td><td><input name="username" id="username" type="text"></td></tr>
        <tr><td>请输入密码: </td><td><input name="password" id="password" type="password"></td></tr>
        <tr>
            <td>
                <label>
                    <select name="type">
                        <option value="0">普通用户</option>
                        <option value="1">管理员</option>
                    </select>
                </label>
            </td>
            <td><input type="submit" value="注册"></td></tr>
    </table>

</form>

${message}

<script type="text/javascript">

    function check()
    {
        var username=document.getElementById("username");
        var password=document.getElementById("password");
        if(username.value.length>6||password.value.length>6)
        {alert("用户名和密码不得超过6位！"); return false;}
        else if(username.value==""||password.value=="")
        {alert("用户名和密码不得为空"); return false;}
        else return true;

    }

</script>

</body>
</html>