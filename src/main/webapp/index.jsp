<%@page contentType="text/html;charset=utf-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv=”Content-Type” content=”text/html; charset=utf-8″>
<title>首页</title>
</head>
<body>
<h2>Hello World!</h2>
<form action="user.action" method="post">
     ID:<input name="id" type="number"/>
     name:<input name="name" type="text"/>
    <input type="submit" value="submit"/><br/>
    中文乱码zhongwenluanma
</form>
</body>
</html>
