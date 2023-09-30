<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="header">
	<h1>
		<a href="${pageContext.request.contextPath }/${authUser.id }"
			style="color: white;"> ${blogTitle } </a>
	</h1>
	<ul>
		<c:choose>
			<c:when test="${empty authUser }">
				<li><a href="${pageContext.request.contextPath }/user/login">로그인</a></li>
			</c:when>

			<c:otherwise>
				<c:choose>
					<c:when test="${authUser.id } ne ${blogVo.blog_id }">
						<li>❤️${authUser.id } 님 블로그❤️</li>
					</c:when>
				</c:choose>
				<!-- 다른 사람이 블로그를 방문할 경우 내블로그로 가기를 위한 새로운 when 조건을 추가 -->
				<li>❤️${authUser.id } ${blogVo.blog_id } 님 블로그ㅇㅇㅇ❤️</li>
				<li><a href="${pageContext.request.contextPath }/user/logout">로그아웃</a></li>
				<li><a
					href="${pageContext.request.contextPath }/${authUser.id }/admin/basic">블로그
						관리</a></li>
			</c:otherwise>
		</c:choose>

	</ul>
</div>