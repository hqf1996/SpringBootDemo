<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="/update" method="post">
    id:<input type="text" id="id" value="${question.id}" name="id" readonly />
    question:<input type="text" id="question" value="${question.question}" name="question"/>
    choose:<input type="text" id="choose" value="${question.choose}" name="choose"/>
    type:<input type="text" id="type" value="${question.type}" name="type"/>
    answer:<input type="text" id="answer" value="${question.answer}" name="answer"/>
    <input type="submit" value="submit" />
</form>
</body>
</html>