<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
pageContext.setAttribute("newline", "\n");
%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JBlog</title>
<Link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/jblog.css">
</head>
<body>
	<div id="container">
		<c:import url="/WEB-INF/views/includes/admin-header.jsp" />
		<div id="wrapper">
			<div id="content">
				<div class="blog-content">
				<c:choose>
				<c:when test="${empty postVo }"><h3 style="color:gray">아직 게시물이 없습니다</h3></c:when>
				
				<c:otherwise>
					<h4>${postVo.title }</h4>
					<p>${fn:replace(postVo.contents , newline, "<br>") }
					<p>
				</c:otherwise>
				</c:choose>
				</div>
				<ul class="blog-list">
					<c:forEach items="${postList }" var="postVo" varStatus="status">
						<c:choose>
							<c:when test="${empty categoryNo }">
								<li><a
									href="${pageContext.request.contextPath }/${blogVo.blog_id }?n=${postVo.no }">${postVo.title }</a>
									<span>${postVo.date }</span></li>
							</c:when>
							<c:otherwise>
								<li><a
									href="${pageContext.request.contextPath }/${blogVo.blog_id }?c=${postVo.category_no }&n=${postVo.no }">${postVo.title }</a>
									<span>${postVo.date }</span></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</ul>
			</div>
		</div>

		<div id="extra">
			<div class="blog-logo">
				<img src="${pageContext.request.contextPath}/${blogVo.image }">
			</div>
		</div>

		<div id="navigation">
			<h2>카테고리</h2>
			<ul>
				<c:forEach items="${list }" var="categoryVo" varStatus="status">
					<li><a
						href="${pageContext.request.contextPath }/${blogVo.blog_id }?c=${categoryVo.no }">${categoryVo.name }</a></li>
				</c:forEach>
			</ul>
		</div>

		<c:import url="/WEB-INF/views/includes/admin-footer.jsp" />
	</div>
</body>
</html>