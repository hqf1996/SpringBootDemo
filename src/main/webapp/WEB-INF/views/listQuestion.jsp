<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>问题列表</h2>
<a href="${pageContext.request.contextPath}/toAdd">添加</a>
<table border="1">
    <tr>
        <td>id</td>
        <td>question</td>
        <td>choose</td>
        <td>type</td>
        <td>answer</td>
    </tr>
    <c:forEach items="${questions}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.question}</td>
            <td>${s.choose}</td>
            <td>${s.type}</td>
            <td>${s.answer}</td>
            <td>
                <a href="${pageContext.request.contextPath}/delete?id=${s.id}">删除</a>
                <a href="${pageContext.request.contextPath}/toUpdate?id=${s.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>