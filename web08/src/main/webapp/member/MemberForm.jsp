<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add.do" method="post">
이름 : <input type="text" name="name"> <br>
이메일 : <input type="text" name="email"> <br>
암호 : <input type="password" name="password"> <br>
<input type="submit" value="추가">
<input type="reset" value="취소">
</form>
</body>
</html>