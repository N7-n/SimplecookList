<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Simple cook List</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style2.css' />">
    </head>
    <body>
    <h1><a href="${pageContext.request.contextPath}/Index">Simple cook List</a></h1>
        <c:if test="${errors != null}">
    	<div id="flush_error" class =er>
        <c:forEach var="error" items="${errors}">
        <c:out value="${error}" /><br />
        </c:forEach>
    	</div>
		</c:if>
		<div class=maink>
   		<article>
        <form method="POST" action="${pageContext.request.contextPath}/Create">
            <br><label class=mar>タイトル<br />
			<input type="text" class=mar name="title" value="${dto.title}" />
			</label>
			<br /><br />
			<label class=mar>作り方<br />			</label>
			<textarea  class=mar rows = 7 name="text"></textarea>
			<br /><br />
			<label class=mar>材料<br />
			<textarea rows= 3 class=mar name="item"></textarea>
			</label>
			<br /><br />
			<label class=mar>時間<br />
			<input type="tel" class=mar name="time" value="${dto.time}"/>分
			</label>
			<br /><br />
			<input type="hidden" name="_token" value="${_token}" />
			<button type="submit">投稿</button>
        </form>
        </article>
        <aside>
        <h3 class=sub>カテゴリー</h3>
        <ul class=sub>
        <li><a href="${pageContext.request.contextPath}/Index">TOPに戻る</a>
        <li><a href="<c:url value='/all' />">全ての投稿</a>
    	<li><a href="<c:url value='/Get' />">おすすめのレシピ</a>
    	<li><a  href="https://docs.google.com/forms/d/e/1FAIpQLSe-zuOdA-CNOtoq1jHF1gJgHANwLV6xiq7ud2GxdpwgoiCGcA/viewform?usp=sf_link">ご意見・お問い合わせ</a>
    	</ul>
    	</aside>
    	</div>
        <div class=frew>
        <a href="${pageContext.request.contextPath}/Index">TOPに戻る</a>
		<a href="<c:url value='/all' />">全ての投稿</a>
		<a  href="https://docs.google.com/forms/d/e/1FAIpQLSe-zuOdA-CNOtoq1jHF1gJgHANwLV6xiq7ud2GxdpwgoiCGcA/viewform?usp=sf_link">ご意見・お問い合わせ</a>
   		</div>
	</body>
</html>

