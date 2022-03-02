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
        <c:if test="${errors != null}">
    	<div id="flush_error" class =er>
        入力内容にエラーがあります<br />
        <c:forEach var="error" items="${errors}">
        <c:out value="${error}" /><br />
        </c:forEach>

    </div>
</c:if>
 <h2>メッセージ新規作成ページ</h2>

        <form method="POST" action="${pageContext.request.contextPath}/Create">
            <label>タイトル<br />
			<input type="text" name="title" value="${dto.title}" />
			</label>
			<br /><br />
			<label>作り方<br />			</label>
			<textarea rows="5" cols="25" name="text"></textarea>
			<br /><br />
			<label>材料<br />
			<textarea rows="5" cols="25" name="item"></textarea>
			</label>
			<br /><br />
			<label>時間<br />
			<input type="tel"  name="time" value="${dto.time}"/>
			</label>
			<br /><br />
			<input type="hidden" name="_token" value="${_token}" />
			<button type="submit">投稿</button>
        </form>

        <p><a href="${pageContext.request.contextPath}/Index">一覧に戻る</a></p>
	</body>
</html>

