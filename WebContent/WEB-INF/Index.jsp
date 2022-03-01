<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
            <c:if test="${flush != null}">
            <div id="flush_success">
                <c:out value="${flush}"></c:out>
            </div>
        </c:if>
    	<c:forEach var="data" items="${data}">
                      <h2><c:out value="${data.id}" /><c:out value="${data.title}"/></h2>
                      <p><c:out value="${data.text}"/></p>
                      <c:out value="${data.item}"/>
                      <p><c:out value="${data.time}"/>分</p>
        </c:forEach>
		<a href="<c:url value='/new' />">新規メッセージの投稿</a>
    </body>
</html>