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
    <c:forEach var="data" items="${data}">
        <h2><c:out value="${data.id}" /> のメッセージ詳細ページ</h2>
        <p>タイトル：<c:out value="${data.title}" /></p>
        <p>メッセージ：<c:out value="${data.text}" /></p>
        <p>材料：<c:out value="${data.item}" /></p>
        <p>材料：<c:out value="${data.time}" /></p>
	</c:forEach>

        <p><a href="${pageContext.request.contextPath}/Index">一覧に戻る</a></p>

    </body>
</html>