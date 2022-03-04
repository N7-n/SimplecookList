<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Simple cook List</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style.css' />">
    </head>
<body>
<h1 class=st><a href="${pageContext.request.contextPath}/Index">Simple cook List</a></h1>
<div class=maink>
        <article>
        	<div class="hamburger-menu">
        		<input type="checkbox" id="menu-btn-check">
        		<label for="menu-btn-check" class="menu-btn"><span></span></label>
               	<div class="menu-content">
         			<ul class=lw>
        				<li><a href="<c:url value='/new' />">新規投稿</a>
        				<li><a href="<c:url value='/all' />">全ての投稿</a>
    					<li><a href="<c:url value='/Get' />">おすすめのレシピ</a>
    					<li><a href="<c:url value='/Iine' />">いいねランキング</a>
    					<li><a href="${pageContext.request.contextPath}/Index">TOPに戻る</a>
    					<li><a  href="https://docs.google.com/forms/d/e/1FAIpQLSe-zuOdA-CNOtoq1jHF1gJgHANwLV6xiq7ud2GxdpwgoiCGcA/viewform?usp=sf_link">ご意見・お問い合わせ</a>
    				</ul>
        		</div>
        	</div>

    		<c:forEach var="data" items="${data}">
                 <div class=metro>
                    <a class=botton href="${pageContext.request.contextPath}/show?id=${data.id}">
                        <c:out value="${data.title}"/>
                    </a>
				    <a class=ll href="${pageContext.request.contextPath}/gooder?id=${data.id}">
					  	いいね:<c:out value="${data.goodcount}" />
					</a>
				 </div>
                 <p class=last></p>
                 <p class=text_a><c:out value="${data.text}"/></p>
                 <div class=metro>
                 	<p class=at>材料 </p>
                 	<p class=at>時間</p>
                 </div>
                 <div class=metro>
                    <p class=text_a><c:out value="${data.item}" /></p>
        			<p class=text_a><c:out value="${data.time}" />分</p>
				 </div>
				 <div class=metro1>
				 <p class=botton><a href="https://twitter.com/share?ref_src=twsrc%5Etfw" class="twitter-share-button" data-text="SimplecookListを一緒に使おう" data-show-count="false">Tweet</a><script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
        		 <p class=kit><a  href="${pageContext.request.contextPath}/gooder?id=${data.id}">
					 いいね:<c:out value="${data.goodcount}" />
				</a></p></div>
        		 <p class=last></p>
        	</c:forEach>
        </article>
		<aside>
			<h3 class=sub>カテゴリー</h3>
        	<ul class=sub>
        <li><a href="<c:url value='/new' />">新規投稿</a>
        <li><a href="<c:url value='/all' />">全ての投稿</a>
    	<li><a href="<c:url value='/Get' />">おすすめのレシピ</a>
    	<li><a href="<c:url value='/Iine' />">いいねランキング</a>
    	<li><a href="${pageContext.request.contextPath}/Index">TOPに戻る</a>
    			<li><a  href="https://docs.google.com/forms/d/e/1FAIpQLSe-zuOdA-CNOtoq1jHF1gJgHANwLV6xiq7ud2GxdpwgoiCGcA/viewform?usp=sf_link">ご意見・お問い合わせ</a>
    		</ul>
    	</aside>
</div>



<div class=frew>
    <a href="${pageContext.request.contextPath}/Index">TOPに戻る</a>
	<a  href="<c:url value='/new' />">新規投稿</a>
	<a href="<c:url value='/all' />">全ての投稿</a>
	<a  href="https://docs.google.com/forms/d/e/1FAIpQLSe-zuOdA-CNOtoq1jHF1gJgHANwLV6xiq7ud2GxdpwgoiCGcA/viewform?usp=sf_link">ご意見・お問い合わせ</a>
</div>
</body>
</html>