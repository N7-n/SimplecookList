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
<div class=maink>
        <article>
    		<c:forEach var="data" items="${data}">
                    <a class=botton href="${pageContext.request.contextPath}/show?id=${data.id}">
                        <c:out value="${data.title}"/>
                    </a>
                      <p class=text_a><c:out value="${data.text}"/></p>
                      <div class=metro><p class=at>材料 </p><p class=at>時間</p></div>
                      <div class=metro>
                      <p class=text_a><c:out value="${data.item}" /></p>
        			  <p class=text_a><c:out value="${data.time}" />分</p>
					  </div>
        	</c:forEach>
        </article>
<aside>
        	<p class="topnew">あなたも投稿してみませんか？<br><a href="<c:url value='/new' />">新規投稿を行う</a></p>
</aside>
</div>



	<div class=frew>
        <a href="${pageContext.request.contextPath}/Index">TOPに戻る</a>
		<a  href="<c:url value='/new' />">新規メッセージの投稿</a>
		<a href="<c:url value='/all' />">全ての投稿</a>
		<a  href="https://docs.google.com/forms/d/e/1FAIpQLSe-zuOdA-CNOtoq1jHF1gJgHANwLV6xiq7ud2GxdpwgoiCGcA/viewform?usp=sf_link">ご意見・お問い合わせ</a>
   </div>
    </body>
</html>