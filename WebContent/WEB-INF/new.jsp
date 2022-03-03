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
        <form method="POST" action="${pageContext.request.contextPath}/Create">
            <label class=lab>・タイトル<br />
			<input type="text" name="title" value="${dto.title}" />
			</label>
			<br /><br />
			<label class=lab>・作り方<br />			</label>
			<textarea  name="text"></textarea>
			<br /><br />
			<label class=lab>・材料<br />
			<textarea name="item"></textarea>
			</label>
			<br /><br />
			<label class=lab>・時間<br />
			<input type="tel"  name="time" value="${dto.time}"/>分
			</label>
			<br /><br />
			<input type="hidden" name="_token" value="${_token}" />
			<button type="submit">投稿</button>
        </form>

        <div class=frew>
        <a href="${pageContext.request.contextPath}/Index">TOPに戻る</a>
		<a href="<c:url value='/all' />">全ての投稿</a>
		<a  href="https://docs.google.com/forms/d/e/1FAIpQLSe-zuOdA-CNOtoq1jHF1gJgHANwLV6xiq7ud2GxdpwgoiCGcA/viewform?usp=sf_link">ご意見・お問い合わせ</a>
   		</div>
	</body>
</html>

