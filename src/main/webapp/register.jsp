<%@ page language="java" contentType="text/html; charset=GBK"
         pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <title>�û�ע��ҳ��</title>
</head>
<body>

<form action="RegisterController" method="post" onSubmit="return check()">

    <table>
        <tr><td>�������Ñ���:</td><td><input name="username" id="username" type="text"></td></tr>
        <tr><td>����������: </td><td><input name="password" id="password" type="password"></td></tr>
        <tr>
            <td>
                <label>
                    <select name="type">
                        <option value="0">��ͨ�û�</option>
                        <option value="1">����Ա</option>
                    </select>
                </label>
            </td>
            <td><input type="submit" value="ע��"></td></tr>
    </table>

</form>

${message}

<script type="text/javascript">

    function check()
    {
        var username=document.getElementById("username");
        var password=document.getElementById("password");
        if(username.value.length>6||password.value.length>6)
        {alert("�û��������벻�ó���6λ��"); return false;}
        else if(username.value==""||password.value=="")
        {alert("�û��������벻��Ϊ��"); return false;}
        else return true;

    }

</script>

</body>
</html>