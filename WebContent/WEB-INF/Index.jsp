<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Simple cook List</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style.css' />">
    </head>
    <body>
    	<h1>Simple cook List</h1>
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
                      <p class=text_a><c:out value="${data.text}"/></p>
                      <h4>☆材料☆</h4>
                      <p class=a><c:out value="${data.item}"/></p>
                      <h4>☆所要時間☆</h4>
                      <p><c:out value="${data.time}"/>分</p>
                      <p>______________________________</p>
        </c:forEach>
        <div class=frew>
		<a  href="<c:url value='/new' />">新規メッセージの投稿</a>
		<a href="<c:url value='/all' />">全ての投稿</a>
		<a  href="https://docs.google.com/forms/d/e/1FAIpQLSe-zuOdA-CNOtoq1jHF1gJgHANwLV6xiq7ud2GxdpwgoiCGcA/viewform?usp=sf_link">ご意見・お問い合わせ</a>
   </div>
    </body>
</html>