<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <h2>メッセージ新規作成ページ</h2>

        <form method="POST" action="${pageContext.request.contextPath}/Create">
            <label>タイトル<br />
			<input type="text" name="title" value="${dto.title}" />
			</label>
			<br /><br />
			<label>メッセージ<br />
			<input type="text"  name="text" value="${dto.text}"/>
			</label>
			<br /><br />
			<input type="hidden" name="_token" value="${_token}" />
			<button type="submit">投稿</button>
        </form>

        <p><a href="${pageContext.request.contextPath}/Index">一覧に戻る</a></p>


