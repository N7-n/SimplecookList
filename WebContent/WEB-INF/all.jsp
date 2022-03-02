<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style.css' />">
    </head>
    <body>
        <c:if test="${flush != null}">
            <div id="flush_success">
                <c:out value="${flush}"></c:out>
            </div>
        </c:if>
    	<c:forEach var="data" items="${data}">
                    <a href="${pageContext.request.contextPath}/show?id=${data.id}">
                        <c:out value="${data.id}" />
                    </a>
                      <c:out value="${data.title}"/>
                      <p class=a><c:out value="${data.text}"/></p>
                      <p class=a><c:out value="${data.item}"/></p>
                      <p><c:out value="${data.time}"/>分</p>
        </c:forEach>
                <p><a href="${pageContext.request.contextPath}/Index">一覧に戻る</a></p>
    </body>
</html>