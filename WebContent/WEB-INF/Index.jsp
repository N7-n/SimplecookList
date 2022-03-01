<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
    	<c:forEach var="data" items="${data}">
                <li>
                      <c:out value="${data.id}" />
                      <c:out value="${data.title}"/>
                      <c:out value="${data.text}"/>
                      <c:out value="${data.item}"/>
                      <c:out value="${data.time}"/>
                </li>
            </c:forEach>

    </body>
</html>